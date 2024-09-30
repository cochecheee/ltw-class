package com.tienblt.project.services.impl;

import java.util.List;

import com.tienblt.project.dao.ICategoryDao;
import com.tienblt.project.dao.impl.CategoryDaoImpl;
import com.tienblt.project.models.CategoryModel;
import com.tienblt.project.services.ICategoryService;
import com.tienblt.project.services.IUserService;

public class CategoryServiceImpl implements ICategoryService{
	
	ICategoryDao catDao = new CategoryDaoImpl();

	@Override
	public List<CategoryModel> findAll() {
		return catDao.findAll();
	}

	@Override
	public CategoryModel findById(int id) {
		// TODO Auto-generated method stub
		return catDao.findById(id);
	}

	@Override
	public CategoryModel findByName(String name) {
		// TODO Auto-generated method stub
		return catDao.findByName(name);
	}

	@Override
	public void insert(CategoryModel category) {
		CategoryModel cate = this.findByName(category.getCategoryname());
		if(cate.getCategoryname() == null) {
			catDao.insert(category);
		}
	}

	@Override
	public void update(CategoryModel category) {
		CategoryModel cate = this.findByName(category.getCategoryname());
		if(cate.getCategoryname() != null) {
			catDao.update(category);
		}
	}

	@Override
	public void delete(int id) {
		catDao.delete(id);
	}

	@Override
	public void updateStatus(int id, int status) {
		catDao.updateStatus(id, status);
		
	}

}

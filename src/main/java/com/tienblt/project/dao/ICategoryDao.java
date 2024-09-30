package com.tienblt.project.dao;

import java.util.List;

import com.tienblt.project.models.CategoryModel;

public interface ICategoryDao {
	List<CategoryModel> findAll();
	CategoryModel findById(int id);
	
	// kiem tra trung lap
	CategoryModel findByName(String name);
	
	// insert new category
	void insert(CategoryModel category);
	void update(CategoryModel category);
	void delete(int id);
	void updateStatus(int id, int status);
	
}

package com.tienblt.project.services;

import java.util.List;

import com.tienblt.project.models.CategoryModel;

public interface ICategoryService {
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

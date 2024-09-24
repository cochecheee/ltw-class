package com.tienblt.project.dao;

import com.tienblt.project.models.UserModel;

public interface IUserDao {
	// declaring methods not implementing
	
	/**
	 * find user by its own username 
	 * return a UserModel object
	 */
	UserModel findByUserName(String username);
	
	//for register
	void insertUser(UserModel newUser);
	boolean checkExistEmail(String email);
	boolean checkExistUserName(String username);
	boolean checkExistPhone(String phone);
	
	// forgot password
	void updatePassword(String username, String password);
	
}

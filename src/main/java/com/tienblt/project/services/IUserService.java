package com.tienblt.project.services;

import com.tienblt.project.models.UserModel;

public interface IUserService {
	UserModel findByUserName(String username);

	UserModel login(String username, String password);

	void insert(UserModel user);

	boolean register(String email, String password, String username, String fullname, String phone);

	boolean checkExistEmail(String email);

	boolean checkExistUserName(String username);

	boolean checkExistPhone(String phone);
	
	boolean forgotPassword(String username, String password);
}

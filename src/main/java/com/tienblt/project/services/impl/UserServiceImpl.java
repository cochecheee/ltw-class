package com.tienblt.project.services.impl;

import com.tienblt.project.dao.IUserDao;
import com.tienblt.project.dao.impl.UserDaoImpl;
import com.tienblt.project.models.UserModel;
import com.tienblt.project.services.IUserService;

public class UserServiceImpl implements IUserService{
	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findByUserName(username);
		if(user != null && password.equals(user.getPassword()))
			return user;
		return null;
	}
	
	public static void main(String[] args) {
		try {
			IUserService userService = new UserServiceImpl(); 
			System.out.println(userService.findByUserName("tienblt"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void insert(UserModel user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean register(String email, String password, String username, String fullname, String phone) {
		if (userDao.checkExistUserName(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		this.insert(new UserModel(email, username, fullname, password, null, 3, phone, date));
		return true;
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUserName(String username) {
		return userDao.checkExistUserName(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public boolean forgotPassword(String username, String password) {
		// if username not exist 
		if(this.findByUserName(username) == null) {
			return false;
		}
		userDao.updatePassword(username, password);
		return true;
	}

	@Override
	public void updatePassword(String username, String password) {
		userDao.updatePassword(username, password);
	}

}

package com.tienblt.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tienblt.project.configs.DBConnectSQLServer;
import com.tienblt.project.dao.IUserDao;
import com.tienblt.project.models.UserModel;

public class UserDaoImpl implements IUserDao {

	@Override
	public UserModel findByUserName(String username) {
		// SQL query
		String sql = "select * from users where username=?";

		try {
			// get connection to database
			Connection conn = new DBConnectSQLServer().getConnection();
			// pass value to SQL query
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			// excute SQL query and return ResultSet object
			ResultSet rs = ps.executeQuery();

			// store data to UserModel and return it
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setFullname(rs.getString("fullname"));
				user.setImages(rs.getString("images"));
				user.setPhone(rs.getString("phone"));
				user.setRoleid(rs.getInt("roleid"));
				user.setCreatedate(rs.getDate("createdate"));

				return user;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// if not existing user, return null
		return null;
	}

	// Test chương trình. Kích phải chuột chọn run as->java application
	public static void main(String[] args) {

		/*
		 * try { IUserDao userDao = new UserDaoImpl();
		 * System.out.println(userDao.findByUserName("tienblt")); } catch (Exception e)
		 * { e.printStackTrace(); }
		 */

		// test insert new user
		/*
		 * try { UserModel newUser = new UserModel(); newUser.setUsername("testuser");
		 * newUser.setPassword("123456"); newUser.setRoleid(2);
		 * System.out.println(newUser);
		 * 
		 * IUserDao userDao = new UserDaoImpl(); userDao.insertUser(newUser); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		// test check exist
		/*
		 * try { IUserDao userDao = new UserDaoImpl(); boolean isEmailExist =
		 * userDao.checkExistEmail("buitien@gmail.com"); boolean isUserNameExist =
		 * userDao.checkExistUserName("tienblt"); boolean isPhoneExist =
		 * userDao.checkExistPhone("123463414650"); System.out.println(isEmailExist);
		 * System.out.println(isPhoneExist); System.out.println(isUserNameExist); }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		
		//test update
		try {
			IUserDao userDao = new UserDaoImpl();
			userDao.updatePassword("tienblt", "1234");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void insertUser(UserModel newUser) {
		String sqlQuery = "insert into users (email, username, fullname, password, images, roleid, phone) values (?,?,?,?,?,?,?)";

		try {
			// step 1: get connection
			Connection conn = new DBConnectSQLServer().getConnection();

			// step 2: passing the values to query
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, newUser.getEmail());
			ps.setString(2, newUser.getUsername());
			ps.setString(3, newUser.getFullname());
			ps.setString(4, newUser.getPassword());
			ps.setString(5, newUser.getImages());
			ps.setInt(6, newUser.getRoleid());
			ps.setString(7, newUser.getPhone());

			// step 3: run query
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkExistEmail(String email) {
		String sqlQuery = "select * from users where email=?";
		try {
			Connection conn = new DBConnectSQLServer().getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next())
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean checkExistUserName(String username) {
		String sqlQuery = "select * from users where username=?";
		try {
			Connection conn = new DBConnectSQLServer().getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next())
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean checkExistPhone(String phone) {
		String sqlQuery = "select * from users where phone=?";
		try {
			Connection conn = new DBConnectSQLServer().getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, phone);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next())
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updatePassword(String username, String password) {
		String sqlQuery = "update users set password = ? where username = ?";
		
		try {
			Connection conn = new DBConnectSQLServer().getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, password);
			ps.setString(2, username);
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

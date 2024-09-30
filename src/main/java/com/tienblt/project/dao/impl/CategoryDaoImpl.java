package com.tienblt.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tienblt.project.configs.DBConnectSQLServer;
import com.tienblt.project.dao.ICategoryDao;
import com.tienblt.project.models.CategoryModel;

public class CategoryDaoImpl implements ICategoryDao {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<CategoryModel> findAll() {
		String sql = "select * from categories";

		// list to save result
		List<CategoryModel> list = new ArrayList<>();

		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);

			// thiet lap tham so (neu co)
			// doc resultset
			rs = ps.executeQuery();

			while (rs.next()) {
				CategoryModel cat = new CategoryModel();
				// ten cot trong database
				cat.setCategoryid(rs.getInt("categoryid"));
				cat.setCategoryname(rs.getString("categoryname"));
				cat.setImages(rs.getString("images"));
				cat.setStatus(rs.getInt("status"));
				list.add(cat);
			}
			conn.close();
			ps.close();
			rs.close();

			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategoryModel findById(int id) {
		String sql = "select * from categories where categoryid=?";
		
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			// truyền vào tham số thứ nhất id (dấu hòi thứ nhat)
			// thiet lap tham so (neu co)
			ps.setInt(1, id);
			//doc resultset
			
			rs = ps.executeQuery();
			CategoryModel cat = new CategoryModel();
			while(rs.next()) {
				//ten cot trong database
				cat.setCategoryid(rs.getInt("categoryid"));
				cat.setCategoryname(rs.getString("categoryname"));
				cat.setImages(rs.getString("images"));
				cat.setStatus(rs.getInt("status"));
			}
			conn.close();
			ps.close();
			rs.close();
			
			return cat;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategoryModel findByName(String name) {
		String sql = "select * from categories where categoryname=?";
		
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			// truyền vào tham số thứ nhất id (dấu hòi thứ nhat)
			// thiet lap tham so (neu co)
			ps.setString(1, name);
			//doc resultset
			
			rs = ps.executeQuery();
			CategoryModel cat = new CategoryModel();
			while(rs.next()) {
				//ten cot trong database
				cat.setCategoryid(rs.getInt("categoryid"));
				cat.setCategoryname(rs.getString("categoryname"));
				cat.setImages(rs.getString("images"));
				cat.setStatus(rs.getInt("status"));
			}
			conn.close();
			ps.close();
			rs.close();
			
			return cat;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(CategoryModel category) {
		String sql = "insert into categories (categoryname, images, status) values (?,?,?)";
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			// truyền vào tham số thứ nhất id (dấu hòi thứ nhat)
			// thiet lap tham so (neu co)
			ps.setString(1, category.getCategoryname());
			ps.setString(2, category.getImages());
			ps.setInt(3, category.getStatus());
			//doc resultset
			ps.executeUpdate(sql);

			conn.close();
			ps.close();
			rs.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(CategoryModel category) {
		String sql = "update categories set categoryname=?, images=?, status=? where categoryid=?";
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			// truyền vào tham số thứ nhất id (dấu hòi thứ nhat)
			// thiet lap tham so (neu co)
			ps.setString(1, category.getCategoryname());
			ps.setString(2, category.getImages());
			ps.setInt(3, category.getStatus());
			//doc resultset
			ps.executeUpdate(sql);

			conn.close();
			ps.close();
			rs.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "delete from categories where categoryid=?";
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
		
			ps.setInt(1, id);
			//doc resultset
			ps.executeUpdate(sql);

			conn.close();
			ps.close();
			rs.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStatus(int id, int status) {
		String sql = "update categories set status=? where categoryid=?";
		
		try {
			conn = new DBConnectSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			// truyền vào tham số thứ nhất id (dấu hòi thứ nhat)
			// thiet lap tham so (neu co)
		
			ps.setInt(1, status);
			ps.setInt(2, id);
	
			ps.executeUpdate(sql);

			conn.close();
			ps.close();
			rs.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

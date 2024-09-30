package com.tienblt.project.controllers.admin;

import java.io.IOException;
import java.util.List;

import com.tienblt.project.models.CategoryModel;
import com.tienblt.project.services.ICategoryService;
import com.tienblt.project.services.impl.CategoryServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//ding nghi tat ca url muon thao tac
@WebServlet(urlPatterns = { "/admin/categories", "/admin/category/add", "/admin/category/insert" })
public class CategoryController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4853819764797158210L;
	public ICategoryService cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// thiet lap bien moi truong
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// whent user click
		String url = req.getRequestURI();
		if (url.contains("/admin/category/add")) {

			req.getRequestDispatcher("/views/admin/category-add.jsp").forward(req, resp);
		}else if(url.contains("/admin/categories")) {
			List<CategoryModel> list = cateService.findAll();
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
		}
		
		// <!-- <c:url value="/admin/category/insert --> 

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// thiet lap bien moi truong
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// whent user click
		String url = req.getRequestURI();
		if (url.contains("/admin/category/insert")) {

			// xu li
			// lay du lieu tu view
			String categoryName = req.getParameter("categoryname");
			int status = Integer.parseInt(req.getParameter("status"));
			String images = req.getParameter("images");
			//dua vao model
			CategoryModel cate = new CategoryModel();
			cate.setCategoryname(categoryName);
			cate.setStatus(status);
			cate.setImages(images);
			
			//mvc khong can service va dao
			//truyen model vao insert
			cateService.insert(cate);
			//tra ve view, chuyen tiep
			resp.sendRedirect(req.getContextPath() + "/admin/categories");
			
			
		}
	}
}

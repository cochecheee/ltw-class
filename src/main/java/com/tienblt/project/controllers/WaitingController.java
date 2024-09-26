package com.tienblt.project.controllers;

import java.io.IOException;

import com.tienblt.project.models.UserModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/waiting")
public class WaitingController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1794039526207515056L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// check information in section and change to correct path
		// get session
		HttpSession session = req.getSession();
		if(session != null && session.getAttribute("account") != null) {
			UserModel user = (UserModel) session.getAttribute("account");
			if(user.getRoleid() == 1) {
				resp.sendRedirect(req.getContextPath() + "/admin/home");
			}else if(user.getRoleid() == 2) {
				resp.sendRedirect(req.getContextPath() + "/manager/home");
			}else {
				resp.sendRedirect(req.getContextPath() + "/user/home");
			}
		}else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}
	}
}

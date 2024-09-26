package com.tienblt.project.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/logout")
public class LogoutController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1366248548188082493L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		
		// Get all cookies from the request
        Cookie[] cookies = req.getCookies();
        
        if (cookies != null) {
            // Iterate through cookies
            for (Cookie cookie : cookies) {
                // Find the specific cookie by name (e.g., "xoa1")
                if (cookie.getName().equals("username")) {
                    // Set its max age to 0 to delete it
                    cookie.setMaxAge(0);
                    // Add the cookie to the response
                    resp.addCookie(cookie);
                    break;
                }
            }
        }

		resp.sendRedirect(req.getContextPath() + "/login");

	}

}

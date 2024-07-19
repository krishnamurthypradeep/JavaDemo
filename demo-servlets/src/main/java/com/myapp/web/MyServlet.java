package com.myapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import com.myapp.web.repository.ProductRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		PrintWriter out = resp.getWriter();
//		String name = req.getParameter("name");
//		
//		out.println("Welcome to world of Jakarta EE "+name);
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
			//out.print("Welcome User, "+username);
			req.setAttribute("products", new ProductRepository().getProducts());
			
			req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("login.html");
		}
		
		out.close();
		
	}

}

// Persistence
// Transaction
// Messaging 
// Security
// WebServices
// Scalability




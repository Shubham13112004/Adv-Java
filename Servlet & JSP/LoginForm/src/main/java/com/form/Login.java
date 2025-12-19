package com.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Login")  
public class Login extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.sendRedirect("index.html");
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//here
		PrintWriter out = response.getWriter();
		
		String u = request.getParameter("Username");
		String p = request.getParameter("Password");
		
		if("admin".equals(u) && "123".equals(p)) {
			out.println("<h3>Login Success</h3>");
		}else {
			
			out.println("<h3>Login Failed</h3>");
			out.println("<a href=\"index.html\">Try Again</a>");
			
		}
		
	}

}

package com.hii;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/regform")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name1");
		String email = request.getParameter("email1");
		String pass = request.getParameter("password1");
		String gen = request.getParameter("gender");
		String city = request.getParameter("city");
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logins","root","9657");
			
			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,pass);
			ps.setString(4,gen);
			ps.setString(5,city);
			
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				response.setContentType("text/html");
				out.print("<h3>SUCCESS</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}else {
				response.setContentType("text/html");
				out.print("<h3>FAILED</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
			response.setContentType("text/html");
			out.print("<h3>"+e.getMessage()+"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
			rd.include(request, response);
		}
			
		
	}

}

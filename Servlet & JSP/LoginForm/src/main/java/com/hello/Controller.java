package com.hello;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name1");
		String password = request.getParameter("pass1");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logins","root","9657");

			
			PreparedStatement ps = con.prepareStatement("select * from emp where email = ? and password =?");
			ps.setString(1, name);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				HttpSession session = request.getSession();
				session.setAttribute("Name", rs.getString("name"));
				
				response.sendRedirect(request.getContextPath() + "/home.jsp");
				
				
				
			}else {
				response.setContentType("text/html");
				
				response.sendRedirect("/login.jsp");
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			response.setContentType("text/html");
			out.print("<h3>Incorrect Email and Password</h3>");
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			
		}
	}

}

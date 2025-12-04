package com.shubh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Crud {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shubham_jdbc";
			String user = "root";
			String pass = "9657";
			
			Connection connection = DriverManager.getConnection(url, user, pass);
			
			
			System.out.println(connection);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}

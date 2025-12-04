package com.panchavati;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Start {

	public static void main(String[] args) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shubham_jdbc";
			String user = "root";
			String pass = "9657";
			
				Connection con = DriverManager.getConnection(url,user,pass);
	
				//insert using Statement 
	
				String q1 = "Insert into shubhs values (5,'Suyash')";
				Statement st = con.createStatement();
				
				st.executeUpdate(q1);
				
				//update using statement 
				
				String q2 = "update shubhs set name = 'Mangesh' where id = 3";
				Statement s = con.createStatement();
				s.executeUpdate(q2);
				
				//Delete using Statement
				
				String q3 = "Delete from shubhs where id = 5";
				Statement s1 = con.createStatement();
				s1.executeUpdate(q3);
				
				//Select using Statement
				
				String q4 = "select * from shubhs";
				Statement ss1 = con.createStatement();
				ResultSet rs = ss1.executeQuery(q4);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					
					System.out.println(id+" "+name);
				}
				

				//insert using Prepared
				
			PreparedStatement p1 = con.prepareStatement(
					
					"insert into shubhs values (?,?)"
					
					);
			p1.setInt(1, 7);
			p1.setString(2,"Shubham");
			
			p1.execute();
			
			
			CallableStatement c1 = con.prepareCall("{call insertU (?,?)}");
			c1.setInt(1, 8);
			c1.setString(2, "Tanishka");
			
			c1.execute();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
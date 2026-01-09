package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.util.DBConnection;

@WebServlet("/update")
public class UpdateUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE users SET name=?, email=?, country=? WHERE id=?"
            );
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, country);
            ps.setInt(4, id);

            ps.executeUpdate();

            response.sendRedirect(request.getContextPath() + "/listUsers");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

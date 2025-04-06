package com.velocis.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.velocis.conn.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String myname= req.getParameter("name1");
		String myemail= req.getParameter("email1");
		String mypass= req.getParameter("pass1");
		String mycity= req.getParameter("city1");
		
		try {
			
			Connection con= DbConnection.getConnection();
			
			String query="Insert into register values(?,?,?,?)";
			
			PreparedStatement ps= con.prepareStatement(query);
			
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mycity);
			
			int count=ps.executeUpdate();
			
			if(count>0) {
				
				out.print("<h3 style='color:green'>Registered Successfully</h3>");
				
				RequestDispatcher rd= req.getRequestDispatcher("/login.html");
				
				rd.include(req, resp);
			}
			
			else {
				out.print("<h3 style='color:red'>Registration Failed</h3>");
				
				RequestDispatcher rd= req.getRequestDispatcher("/register.html");
				
				rd.include(req, resp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

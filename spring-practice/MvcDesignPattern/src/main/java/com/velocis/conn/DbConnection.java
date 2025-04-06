package com.velocis.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/pranjul";

		String userName = "root";

		String password = "Pranjul@12345";

		Connection con = null;
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);			
		}
		catch(Exception e) {
		   e.printStackTrace();	
		}
		
		return  con;
	}
}

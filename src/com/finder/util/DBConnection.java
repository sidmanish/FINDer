package com.finder.util;

import java.sql.*;

public class DBConnection {
	public static Connection dbConnection() {
		Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finder","root","root");

	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return con;
	}
	public static void main(String args[])
	{
	System.out.println(dbConnection());	
	}

}

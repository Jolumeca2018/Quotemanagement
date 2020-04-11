package com.dbconnectionutil.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	static String HOST="";
	static String USER="";
	static String PASSWORD="";
	
	public static void getconnection() {
		try {
		    Connection conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/quotes_db?" +
		                                   "user=root&password=Quotes2020");

		    // Do something with the Connection

		   
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}

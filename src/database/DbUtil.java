package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
		protected static Connection openConnection() {
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver").newInstance();
	    	}catch(Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	        Connection connection;
	        try {
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quotes_db?serverTimezone=UTC", "root", "Quotes2020");
	        	if (connection == null) {
	                System.out.println("Failed to make connection!");
	            }
	        } catch (SQLException e) {
	            System.out.println("MySQL Connection Failed!" + e);
	            return null;
	        }
	        return connection;
	    }
	    
	    protected static void closeConnection(Connection conn){
	        try {
	            conn.close();
	        }catch (SQLException e){
	            System.out.println("Problems during closeConnection connection" + e);
	        }
	    }
}

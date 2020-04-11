package database;
import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import objects.Quoarray;
import objects.Quote;


public class QuotesDb extends DbUtil{
private static final String LOG_ERROR_MSG = "Error during the  order %s";
	
	public static List<Quoarray> findAll() throws Exception{
		List <Quoarray> quotes = new ArrayList<Quoarray>();
	
	    Connection conn = openConnection();
	    try {
	        Statement statement = conn.createStatement();
	        ResultSet resultSet = statement
	                .executeQuery(
	                        " SELECT * " +
	                                "  FROM " +
	                                "     quotes_db.quotecab");
	
	
	        while (resultSet.next()) {
	        	int nroquote = resultSet.getInt("NumQuote");
	        	Date datquote = resultSet.getDate("DateQuote");
	        	int staquote = resultSet.getInt("StateQuote");
	        	int idcustomer = resultSet.getInt("idcustomers");
	        	String nacustomer = resultSet.getString("customers_name");
	        	
	            Quoarray newQuote = new Quoarray(nroquote, datquote, staquote, idcustomer, nacustomer);
	            
	            quotes.add(newQuote);
	        }
	
	    } catch (SQLException e) {
	        System.out.println(String.format(LOG_ERROR_MSG, "findAll") + e);
	        throw new Exception(String.format(LOG_ERROR_MSG, "findAll")+ e);
	    } finally {
	        closeConnection(conn);
	    }
	    return quotes;
	}
	
	public static void insertQuote(int nroquote, Date datquote,int staquote, int idcustomer, String nacustomer) throws Exception{
		Connection conn = openConnection();
		try {
			String query = "INSERT INTO quotecab(NumQuote,DateQuote,StateQuote,idcustomers,customers_name) VALUES(?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, nroquote);
			ps.setDate(2, datquote);
			ps.setInt(3, staquote);
			ps.setInt(4, idcustomer);
			ps.setString(5, nacustomer);
			
			int row = ps.executeUpdate();
			
			if (row>0){
				System.out.println("record add into table");
				//response.sendRedirect("custo.jsp");//
			}
			else{
				System.out.println("Error en query");
			}
		} catch (SQLException e) {
	        System.out.println(String.format(LOG_ERROR_MSG, "findAll") + e);
	        throw new Exception(String.format(LOG_ERROR_MSG, "findAll")+ e);
	    } finally {
	        closeConnection(conn);
	    }
	}
}

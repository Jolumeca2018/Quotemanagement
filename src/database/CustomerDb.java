package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import objects.Cusarray;
import objects.Quote;

public class CustomerDb extends DbUtil{
	private static final String LOG_ERROR_MSG = "Error during the  order %s";
	
	public static List<Cusarray> findAll() throws Exception{
		List <Cusarray> customer = new ArrayList<Cusarray>();
	
	    Connection conn = openConnection();
	    try {
	        Statement statement = conn.createStatement();
	        ResultSet resultSet = statement
	                .executeQuery(
	                        " SELECT * " +
	                                "  FROM " +
	                                "     quotes_db.customers");
	
	
	        while (resultSet.next()) {
	        	int idcustomers = resultSet.getInt("idcustomers");
	        	String customername = resultSet.getString("customers_name");
	            Cusarray newCustomer = new Cusarray(idcustomers, customername);
	            
	            customer.add(newCustomer);
	        }
	
	    } catch (SQLException e) {
	        System.out.println(String.format(LOG_ERROR_MSG, "findAll") + e);
	        throw new Exception(String.format(LOG_ERROR_MSG, "findAll")+ e);
	    } finally {
	        closeConnection(conn);
	    }
	    return customer;
	}
	
	public static void insertCustomer(int idcustomer, String nacustomer) throws Exception{
		Connection conn = openConnection();
		try {
			String query = "INSERT INTO customers(idcustomers,customers_name) VALUES(?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, idcustomer);
			ps.setString(2, nacustomer);
			
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

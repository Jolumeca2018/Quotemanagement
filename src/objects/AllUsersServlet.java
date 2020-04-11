package objects;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import database.CustomerDb;
import objects.Quote;

public class AllUsersServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	List<Cusarray> ls;
        try {
        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/customers.jsp");
        	try {
            	ls = CustomerDb.findAll();
            	req.setAttribute("model", ls);
            }catch(Exception e) {
            	System.out.println(e.getMessage());
            }
            dispatcher.forward(req, resp);
        }catch (ServletException ex) {
            throw ex;
        } catch (Exception ex) {
            throw ex;
        }     
    }
}

package objects;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.QuotesDb;
public class GeneralServlet extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	List<Quoarray> ls;
        try {
        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/general.jsp");
        	try {
            	ls = QuotesDb.findAll();
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

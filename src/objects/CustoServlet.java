package objects;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CustomerDb;

/**
 * Servlet implementation class CustoServlet
 */
public class CustoServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
    	String action = req.getPathInfo();
        if (action == null) {
        	action = "list";
        }
        
	    try {
	    	switch (action) {
		        case "/insert":
		            insert(req, resp);
		            break;
		        default:
		        	getAll(req, resp);
		        	break;
	        }
	    } catch (ServletException ex) {
	        throw ex;
	    } catch (Exception ex) {
	        throw new ServletException(ex);
	    }
    }
    
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
    	doGet(req, resp);
    }
    
    private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    	//Forward the request to users.jsp to render the list
    	List<Quote> ls;
        try {
//        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/custo.jsp");

        	int iduser =  Integer.parseInt(req.getParameter("idcustomer"));
        	String nacustomer =  req.getParameter("nacustomer");
        	 try {
             	CustomerDb.insertCustomer(iduser, nacustomer);
             	resp.sendRedirect(req.getContextPath() + "/custo");
             }catch(Exception e) {
             	System.out.println(e.getMessage());
             }
//        	 dispatcher.forward(req, resp);
            
//        }catch (ServletException ex) {
//            throw ex;
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    private void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    	//Forward the request to users.jsp to render the list
    	List<Cusarray> ls;
        try {
        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/custo.jsp");
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

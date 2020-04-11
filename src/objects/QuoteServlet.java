package objects;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.QuotesDb;

import objects.Quoarray;
import objects.Quote;

public class QuoteServlet extends HttpServlet {

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
//	        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/custo.jsp");

	        	int nrquote =  Integer.parseInt(req.getParameter("nroquote"));
	        	Date datquote = Date.valueOf(req.getParameter("datquote"));
	        	int stquote =  Integer.parseInt(req.getParameter("staquote"));
	        	int idcusto =  Integer.parseInt(req.getParameter("idcustomer"));
	        	String nacusto =  req.getParameter("nacustomer");
	        	
	        	
	        	 try {
	             	QuotesDb.insertQuote(nrquote, datquote, stquote, idcusto, nacusto );
	             	resp.sendRedirect(req.getContextPath() + "/quotes");
	             }catch(Exception e) {
	             	System.out.println(e.getMessage());
	             }
//	        	 dispatcher.forward(req, resp);
	            
//	        }catch (ServletException ex) {
//	            throw ex;
	        } catch (Exception ex) {
	            throw ex;
	        }
	    }
	    
	    private void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	    	//Forward the request to users.jsp to render the list
	    	List<Quoarray> ls;
	        try {
	        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/quotes.jsp");
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

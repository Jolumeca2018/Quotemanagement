package objects;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.Conarray;

public class ContactServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Conarray[] arr = new Conarray[6];
        arr[0] = new Conarray("Melendez","Jorge", "204-8090-765", "jorge@winpak.com");
        arr[1] = new Conarray("Garcia","Ian", "204-8090-766", "ian@winpak.com");
        arr[2] = new Conarray("Rosales","Maria", "204-8090-767", "maria@winpak.com");
        arr[3] = new Conarray("Aramayo","Adriana", "204-8090-768", "adriana@winpak.com");
        arr[4] = new Conarray("Rios","Leonardo", "204-8090-769", "leo@winpak.com");
        arr[5] = new Conarray("Rubio","Xochilt", "204-8090-770", "xochilt@winpak.com");
        
        
        //Forward the request to users.jsp to render the list
        try {
        	RequestDispatcher dispatcher = req.getRequestDispatcher("pages/contacts.jsp");
            req.setAttribute("model", arr);
            dispatcher.forward(req, resp);
        }catch (ServletException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
        
    }
}
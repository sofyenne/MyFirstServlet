import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String name  =  req.getParameter("name") ;
           PrintWriter printer  = resp.getWriter();
           StringBuilder outpout = new StringBuilder();
           outpout.append("<html><body>");
           outpout.append("<h3> the name of user  is "+ name + "</h3>");
           outpout.append("<html><body>");
           printer.println(outpout);
	}

}

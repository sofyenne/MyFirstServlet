import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.CalculImp;
import web.ResModel;
@WebServlet(name="PoidsServlet" , urlPatterns = "*.poids")
public class PoidsServlet extends HttpServlet {
	
	private CalculImp calc ;
	
	@Override
	public void init() throws ServletException {
		calc = new CalculImp() ;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResModel res = new ResModel();
		 req.setAttribute("model", res);
		req.getRequestDispatcher("Poids.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double taille = Double.parseDouble(req.getParameter("taille"));
		String sexe = req.getParameter("sexe");
		ResModel res =  new ResModel();
		res.setSexe(sexe);
		res.setTaille(taille);
		res.setPoids(calc.claculePoids(taille, sexe));
		req.setAttribute("model", res);
		req.getRequestDispatcher("Poids.jsp").forward(req, resp);
		
		
	}

}

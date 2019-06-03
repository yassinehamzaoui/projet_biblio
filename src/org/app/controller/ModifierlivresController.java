package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class ModifierlivresController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
		         throws IOException, ServletException {
		   String titrelivre = request.getParameter("nomlivre4");
		   LivreService livreservice = new LivreService();
		   Livre livre = null;
		   livre = livreservice.findByName(titrelivre);
		   request.getSession().setAttribute("livre_a_modifier",livre);
		   response.sendRedirect("modifierlivres2.jsp");
	   }
}


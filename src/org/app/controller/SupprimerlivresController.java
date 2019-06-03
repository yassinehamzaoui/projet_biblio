package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class SupprimerlivresController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String titrelivre = request.getParameter("nomlivre3");
    LivreService livreservice = new LivreService();
    Livre livre = null;
    livre = livreservice.findByName(titrelivre);

    try {
    livreservice.delete(livre);
	response.sendRedirect("supprimerlivres.jsp");
    } catch (Exception e) {
		e.printStackTrace();
    	}
    
	}	
}

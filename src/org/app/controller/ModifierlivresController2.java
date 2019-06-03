package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class ModifierlivresController2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    String titrelivre = request.getParameter("titrelivre");
    String auteurlivre = request.getParameter("auteurlivre");
    String themelivre = request.getParameter("themelivre");
    String languelivre = request.getParameter("languelivre");
    String Dateparution = request.getParameter("Dateparution");
    int Nbrpage = Integer.parseInt(request.getParameter("Nbrpage"));

    LivreService livreservice = new LivreService();
    Livre livre5 = null; 
    livre5 = livreservice.findByName(titrelivre);
    livre5.setTitreLivre(titrelivre);
    livre5.setAuteurLivre(auteurlivre);
    livre5.setThemeLivre(themelivre);
    livre5.setLangueLivre(languelivre);
    livre5.setDateParution(Dateparution);
    livre5.setNbrPageLivre(Nbrpage);

    try {
    livreservice.modify(livre5);
	response.sendRedirect("modifierlivres.jsp");
    } catch (Exception e) {
		e.printStackTrace();
    	}
	}
}

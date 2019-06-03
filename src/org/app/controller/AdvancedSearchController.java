package org.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class AdvancedSearchController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		 String msg = "";
		 String motderecherche = request.getParameter("motderecherche");
		 if(request.getParameter("radios") != null) {
		 if(request.getParameter("radios").equals("cherchertitre")) {
			 LivreService bookservice = new LivreService();
			 Livre book = null;
			 book = bookservice.findByName(motderecherche);
			 request.getSession().setAttribute("book",book);   
	         response.sendRedirect("recherche_resultat_avancee.jsp");
                }
 		 if(request.getParameter("radios").equals("chercherauteur")) {
			 LivreService bookservice = new LivreService();
			 List<Livre> listbook = null;
			 listbook = bookservice.findByAutor(motderecherche);
			 request.getSession().setAttribute("listbook",listbook);   
	         response.sendRedirect("recherche_resultat_avancee_auteur.jsp");
        }
        if(request.getParameter("radios").equals("cherchertheme")) {
			 LivreService bookservice = new LivreService();
			 List<Livre> listbook = null;
			 listbook = bookservice.findBytheme(motderecherche);
			 request.getSession().setAttribute("listbook",listbook);   
	         response.sendRedirect("recherche_resultat_avancee_theme.jsp");
   
        }
        if(request.getParameter("radios").equals("chercherlangue")) {
			 LivreService bookservice = new LivreService();
			 List<Livre> listbook = null;
			 listbook = bookservice.findByLanguage(motderecherche);
			 request.getSession().setAttribute("listbook",listbook);   
	         response.sendRedirect("recherche_resultat_avancee_langue.jsp");
        }
         if(motderecherche == null){
        	 msg = "Erreur Livre Introuvable Veuillez Réessayer";
        	 request.getSession().setAttribute("msg",msg); 
             response.sendRedirect("recherche_avancee.jsp");
         }
         
		 }}
}
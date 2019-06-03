package org.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class MeslivresAdminController  extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	String msg;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 String namebook = request.getParameter("nomlivre2");
		 LivreService bookservice = new LivreService();
		 Livre book = null;
		 book = bookservice.findByName(namebook);
         if(book!=null)
		 {
	     msg = null;
         request.getSession().setAttribute("book",book);      
         response.sendRedirect("rechercher_resultat.jsp");
         }
         else{
        	 msg = "Erreur Livre Introuvable Veuillez Réessayer";
        	 request.getSession().setAttribute("msg",msg); 
             response.sendRedirect("rechercher.jsp");
    }
}
}
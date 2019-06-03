package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Livre;
import org.app.service.LivreService;

public class AjouterlivresController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     String titrelivre = request.getParameter("titrelivre");
     String auteurlivre = request.getParameter("auteurlivre");     
     String themelivre = request.getParameter("themelivre");
     String languelivre = request.getParameter("languelivre");
     String Dateparution = request.getParameter("Dateparution");
     int Nbrpage = Integer.parseInt(request.getParameter("Nbrpage"));
     try {
         Livre l1 = new Livre(titrelivre,auteurlivre,themelivre,languelivre,Dateparution,Nbrpage);
    	 LivreService livreservice = new LivreService();
    	 livreservice.add(l1);
         if(titrelivre == "" || auteurlivre == "" || themelivre == "" || languelivre == "" || Dateparution == ""){
        	 response.sendRedirect("ajouterlivres.jsp");
         }else{
        	 response.sendRedirect("listelivres.jsp");
         }
     } catch (Exception e) {
		e.printStackTrace();
     	}
     
	}		
}
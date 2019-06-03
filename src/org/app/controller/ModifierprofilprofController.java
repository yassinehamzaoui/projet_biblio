package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Professeur;
import org.app.service.ProfesseurService;

public class ModifierprofilprofController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
		         throws IOException, ServletException {
		   
		   String nomadmin = request.getParameter("nom_admin");
		   String prenomadmin = request.getParameter("prenom_admin");
		   String adresseadmin = request.getParameter("adresse_admin");
		   String emailadmin = request.getParameter("email_admin");
		   String mdpadmin = request.getParameter("mdp1");

		   ProfesseurService adminservice = new ProfesseurService();
		   Professeur Prof1 = null;
		   
		   Prof1 = adminservice.findByEmail(emailadmin);
		   
		   Prof1.setNomProfesseur(nomadmin);
		   Prof1.setPrenomProfesseur(prenomadmin);
		   Prof1.setAdresseProfesseur(adresseadmin);
		   Prof1.setEmailProfesseur(emailadmin);
		   Prof1.setPassProfesseur(mdpadmin);

		    try {
				adminservice.modify(Prof1);
		    	response.sendRedirect("afficherprofil.jsp");
		        } catch (Exception e) {
		    		e.printStackTrace();
		        	}
		    	}
}

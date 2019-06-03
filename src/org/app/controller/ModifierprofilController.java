package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Administrateur;
import org.app.service.AdministrateurService;

public class ModifierprofilController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
		         throws IOException, ServletException {
		   
		   String nomadmin = request.getParameter("nom_admin");
		   String prenomadmin = request.getParameter("prenom_admin");
		   String adresseadmin = request.getParameter("adresse_admin");
		   String emailadmin = request.getParameter("email_admin");
		   String mdpadmin = request.getParameter("mdp1");

		   AdministrateurService adminservice = new AdministrateurService();
		   Administrateur admin1 = null;
		   
		   admin1 = adminservice.findByEmail(emailadmin);
		   
		   admin1.setNomAdministrateur(nomadmin);
		   admin1.setPrenomAdministrateur(prenomadmin);
		   admin1.setAddresseAdministrateur(adresseadmin);
		   admin1.setEmailAdministrateur(emailadmin);
		   admin1.setPassAdministrateur(mdpadmin);

		    try {
				adminservice.modify(admin1);
		    	response.sendRedirect("afficherprofil.jsp");
		        } catch (Exception e) {
		    		e.printStackTrace();
		        	}
		    	}
}

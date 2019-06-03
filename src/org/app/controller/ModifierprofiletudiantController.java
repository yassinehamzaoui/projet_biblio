package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Etudiant;
import org.app.service.EtudiantService;

public class ModifierprofiletudiantController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
		         throws IOException, ServletException {
		   
		   String nomadmin = request.getParameter("nom_admin");
		   String prenomadmin = request.getParameter("prenom_admin");
		   String adresseadmin = request.getParameter("adresse_admin");
		   String emailadmin = request.getParameter("email_admin");
		   String mdpadmin = request.getParameter("mdp1");

		   EtudiantService adminservice = new EtudiantService();
		   Etudiant etudiant1 = null;
		   
		   etudiant1 = adminservice.findByEmail(emailadmin);
		   
		   etudiant1.setNomEtudiant(nomadmin);
		   etudiant1.setPrenomEtudiant(prenomadmin);
		   etudiant1.setAddresseEtudiant(adresseadmin);
		   etudiant1.setEmailEtudiant(emailadmin);
		   etudiant1.setPassEtudiant(mdpadmin);

		    try {
				adminservice.modify(etudiant1);
		    	response.sendRedirect("afficherprofil.jsp");
		        } catch (Exception e) {
		    		e.printStackTrace();
		        	}
		    	}
}

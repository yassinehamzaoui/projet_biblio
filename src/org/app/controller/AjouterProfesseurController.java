package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.Professeur;
import org.app.service.ProfesseurService;

public class AjouterProfesseurController  extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

	     String nom_prof = request.getParameter("nom_prof");
	     String prenom_prof = request.getParameter("prenom_prof");     
	     String adresse_prof = request.getParameter("adresse_prof");
	     String specialite_prof = request.getParameter("specialite_prof");
	     String email_prof = request.getParameter("email_prof");
	     String pass_prof = request.getParameter("pass_prof");
 	 
	     try {
	    	 Professeur l1 = new Professeur(nom_prof, prenom_prof, adresse_prof, email_prof, pass_prof, specialite_prof);
	    	 ProfesseurService professeurservice = new ProfesseurService();
	    	 professeurservice.add(l1);
	         if(nom_prof == "" || prenom_prof == "" || adresse_prof == "" || specialite_prof == "" || email_prof == "" || pass_prof == ""){
	        	 response.sendRedirect("ajouterprofesseur.jsp");
	         }else{
	        	 response.sendRedirect("ajouterprofesseursuccess.jsp");
	         }
	     } catch (Exception e) {
			e.printStackTrace();
	     	}
	     
		}	
 	 
	}
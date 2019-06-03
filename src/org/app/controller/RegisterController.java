package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.app.beans.Etudiant;
import org.app.beans.User;
import org.app.service.EtudiantService;
import org.app.service.UserService;
 
 
public class RegisterController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     String Nom = request.getParameter("Nom");
     String Prenom = request.getParameter("Prenom");
     String Adresse = request.getParameter("Adresse");
     String Email = request.getParameter("Email");
     String Pass = request.getParameter("Pass");
     int Restriction = 1;
     try {
         Etudiant e1 = new Etudiant(Nom,Prenom,Adresse,Email,Pass);
         User user = new User(Email,Pass,Restriction);
    	 EtudiantService etudidantservice = new EtudiantService();
         UserService userservice = new UserService();
         if(Nom == "" || Prenom == "" || Adresse == "" || Email == "" || Pass == ""){
        	 response.sendRedirect("error_register.jsp");
         }else{
        	 userservice.add(user);  
        	 etudidantservice.add(e1);
        	 response.sendRedirect("success_register.jsp");
         }
     } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
}
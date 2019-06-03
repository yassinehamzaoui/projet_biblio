package org.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.app.beans.User;
import org.app.service.UserService;


public class LoginController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     String username = request.getParameter("username");   
     String pass = request.getParameter("pass");
     UserService service = new UserService();
 	 User user2 = null;
 	 user2 = service.checkUser(username,pass);
 	 
 	if(user2!=null && user2.getRoleUser() == 1){
         request.getSession().setAttribute("user", user2);      
         response.sendRedirect("espace_etudiant.jsp");
     }
 	else if(user2!=null && user2.getRoleUser() == 2){
        request.getSession().setAttribute("user", user2);      
        response.sendRedirect("espace_professeur.jsp");
 	}
 	else if(user2!=null && user2.getRoleUser() == 3){
        request.getSession().setAttribute("user", user2);      
        response.sendRedirect("espace_admin.jsp");
 	}
     else{
         response.sendRedirect("error.jsp");
     }
}
}

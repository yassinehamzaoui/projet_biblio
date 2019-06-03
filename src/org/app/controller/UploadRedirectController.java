package org.app.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadRedirectController  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	String nomlivre6 = request.getParameter("nomlivre5");
    	request.getSession().setAttribute("nomlivre7", nomlivre6);  
        response.sendRedirect("upload2.jsp");
    }
}
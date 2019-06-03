package org.app.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadProfController  extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DownloadProfController() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String filename1 = request.getParameter("nomlivre02");
		String filename2 = ".pdf";
		String filename3 = filename1.concat(filename2); 
		String filepath = "C:\\Users\\Yassine\\Workspace\\SIM\\WebContent\\uploads\\";   
		response.setContentType("APPLICATION/OCTET-STREAM");   
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename3 + "\"");
		FileInputStream fileInputStream = new FileInputStream(filepath + filename3);  
		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		out.write(i);   
		}   
		fileInputStream.close();   
		out.close(); 
		
	}
	
}
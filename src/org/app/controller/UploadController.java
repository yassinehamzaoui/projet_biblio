package org.app.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.app.beans.Livre;
import org.app.service.LivreService;


public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String titrelivre;
	String auteurlivre;
	String themelivre;
	String Dateparution;
	String Nbrpage;
	
    public UploadController() {super();}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    		  PrintWriter out = response.getWriter();
    		  if(!ServletFileUpload.isMultipartContent(request)){
    		   out.println("Nothing to upload");
    		   return; 
    		  }
    		  FileItemFactory itemfactory = new DiskFileItemFactory(); 
    		  ServletFileUpload upload = new ServletFileUpload(itemfactory);  		  
    		  try{
    		   List<FileItem>  items = upload.parseRequest(new ServletRequestContext(request));
    		   for(FileItem item:items){
    			if (item.getFieldName().equals("titrelivre"))
    			{
    				 titrelivre = item.getString();
    			}
    			if (item.getFieldName().equals("auteurlivre"))
    			{
    				auteurlivre = item.getString();
    			}
    			if (item.getFieldName().equals("themeauteur"))
    			{	
    				themelivre = item.getString();
    			}
    			if (item.getFieldName().equals("Dateparution"))
    			{
    				Dateparution = item.getString();			
    			}
    			if (item.getFieldName().equals("Nbrpage"))
    			{
    				Nbrpage = item.getString();	
    			}
    			if (item.getFieldName().equals("file"))
    			{
					@SuppressWarnings("unused")
					String contentType = item.getContentType();
        		    String titrelivre2 = titrelivre.concat(".pdf");
        		    File uploadDir = new File("C:\\Users\\Yassine\\Workspace\\SIM\\WebContent\\uploads",titrelivre2);
        		    item.write(uploadDir);
        		    LivreService livreservice = new LivreService();
        		    Livre l1 = livreservice.findByName(titrelivre);
        		    String filepath = "C:\\Users\\Yassine\\Workspace\\SIM\\WebContent\\uploads\\";
        		    String filepath2 = filepath.concat(titrelivre2);
        		    l1.setPath(filepath2);
        		    livreservice.modify(l1);
        		    response.sendRedirect("upload_success.jsp");
    			}
    		   }
    		  }
    		  catch(FileUploadException e){
    		    
    		   out.println("upload fail");
    		  }
    		  catch(Exception ex){
    		    
    		   out.println(ex);
    		  }
    }
}
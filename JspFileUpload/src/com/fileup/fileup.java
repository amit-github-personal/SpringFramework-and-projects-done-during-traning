package com.fileup;

import java.io.File; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

/**
 * Servlet implementation class fileup
 */
@WebServlet("/fileup")
public class fileup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fileup() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	private static final String SAVE_DIR = "uploadFiles";


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*//Creating a factory for disk based file item
		DiskFileItemFactory fileItem=new DiskFileItemFactory();
		
		//My Maximum Memory Size
		fileItem.setSizeThreshold(20000);
		
		ServletFileUpload fileUpload=new ServletFileUpload(fileItem);
		
		//Setting Maximum size upload
		fileUpload.setFileSizeMax(2096);
		
		//Parsing the request
		try {
			
			//After parsing the request we'll get fileItem list 
			List<FileItem> items=fileUpload.parseRequest(request);
			
			for(FileItem item:items)
			{
				//Checking if item is a normal form filled data
				if(item.isFormField())
				{
					String field=item.getFieldName();
					String value=item.getString();
				}
				else
				{
					String fildname=item.getFieldName();
					String filename=item.getName();
					
					//Getting the root project path
					String root=request.getContextPath();
					
					File f=new File("C:\\Users\\Amit\\Jsp\\JspFileUpload"+filename);
					
					if(f.exists())
					{
						item.write(f);
						PrintWriter out=response.getWriter();
						out.print("<h1>Data uploaded Successfully :)</h1>");
					}
					else
					{
						f.mkdir();
						item.write(f);
						PrintWriter out=response.getWriter();
						out.print("<h1>Data uploaded Successfully :)</h1>");
					}
					
					
				}
			}

			

		} catch (Exception r) {
			
			request.setAttribute("message", "Exception occured while writing file :"+r);
		}*/
		
		//process only if its multipart content
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
              
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        item.write( new File("C:/uploads" + File.separator + name));
                        System.out.println("File Uploaded");
                    }
                }
           
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
               System.out.println("Exception Occured: "+ex);
            }          
         
        }else{
            request.setAttribute("message",
                                 "Sorry this Servlet only handles file upload request");
            System.out.println("File not uploaded ");
        }
    
        
				
	}
}


package com.javaTpoint;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("File Upload Successfully");
		PrintWriter out=response.getWriter();
		if(ServletFileUpload.isMultipartContent(request))
		{
			try
			{
				ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
				List<FileItem> items=sf.parseRequest(new ServletRequestContext(request));
				for(FileItem item:items)
				{
					if(!item.isFormField())
					{
						//String name=new File(item.getName()).getName();
						//item.write(new File(UPLOAD_DIRECTORY+File.separator+name));
						String fileName=item.getName();
						String root=getServletContext().getRealPath("/");
						File path=new File(root+"/images");
						if(!path.exists())
						{
							boolean status=path.mkdirs();
						}
						File uploadedFile=new File(path+"/"+fileName);
						System.out.println(uploadedFile.getAbsolutePath());
						if(fileName!="")
							item.write(uploadedFile);
						else
							out.println("file not found");
						out.println("<h1>File Uploaded Successfully....:-)</h1>");
					}
					
				}
				request.setAttribute("meassage", "File Uploaded Successfully");
			}
			catch(Exception e)
			{
				request.setAttribute("message","File Uploaded fail due to "+e);
			}
		}
	}

}

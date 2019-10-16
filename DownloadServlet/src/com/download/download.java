package com.download;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class download
 */
@WebServlet("/download")
public class download extends HttpServlet {

	
	private static final String File_N="Java_Developer.pdf";
	private static final String File_Path="C:\\uploads\\";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Generating download link for servlet
		//We need to infom the server that the content is being sent in form of application/octet-stream
		response.setContentType("APPLICATION/OCTET-STREAM");
		
		PrintWriter out=response.getWriter();
		
		response.setHeader("Content-Disposition" , "attachment; filename=\""+File_N+"\"");
		
		FileInputStream fis=new FileInputStream(File_Path + File_N);
		
		int i;
		
		while((i=fis.read())!=-1)
		{
			out.write(i);
		}
		
		fis.close();
		out.close();
		
	}

}

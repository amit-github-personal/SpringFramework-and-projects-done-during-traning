package com.client.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.client.Database.Database;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		Database db=new Database();
		db.Connect();
		
		boolean a=db.searchUser(user, pass);
		
		if(a)
		{
			
			JOptionPane.showMessageDialog(null, "Succcessfully Logged in.");
			System.out.println("Logged in with boolean value :"+a);
			HttpSession session=request.getSession();
			session.setAttribute("flag", "true");
			response.sendRedirect("index.jsp");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid ! Username or password");
			response.sendRedirect("login.jsp");
		}
	}

}

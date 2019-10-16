package com.javatpoint;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mailer
 */
@WebServlet("/mailer")
public class mailer extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Happy");
		
		String to=request.getParameter("t1");
		String sub=request.getParameter("t2");
		String msg=request.getParameter("t3");
		String from="amitmishra1800@gmail.com";
		String pass="Techmn.588939";
		
		Properties prop=new Properties();
		
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "465");
		
		//GetSession
		
		Session session=Session.getDefaultInstance(prop,new javax.mail.Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication(from,pass);
			}
		});
		
		//Compose
		try {
			
			MimeMessage message=new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			message.setText(msg);
		
			//Sending Message
			Transport.send(message);
			System.out.println("Message sent Successfully");
		}
		
		catch(MessagingException e) { 
			throw new RuntimeException(e);
		}
	}

}

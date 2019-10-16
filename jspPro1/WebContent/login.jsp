<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%
	String user=request.getParameter("t1");
		String pass=request.getParameter("t2");
		
		if(user.equals("admin") && pass.equals("admin@123"))
		{
			out.print("welcome: "+user);
			
		}
		else
		{
			out.print("Incorrect username or password");
		}
		%>
	
	
</body>
</html>
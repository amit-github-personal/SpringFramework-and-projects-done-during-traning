<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String user=request.getParameter("t1");
	String pass=request.getParameter("t2");
	
	String usr=application.getInitParameter("Username");
	String password=application.getInitParameter("password");
	
	if(user.equals(usr) && pass.equals(password))
	{
		out.print("UserName :"+usr);
		out.print("<br/>Password : "+password);
	}
	else
	{
		out.print("<br/>Incorrect username or password");
	}

	%>

</body>
</html>
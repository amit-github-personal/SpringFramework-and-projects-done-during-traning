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

	String user=request.getParameter("email");
	String pwd=request.getParameter("pwd");
	
	pageContext.setAttribute("usr",user,pageContext.SESSION_SCOPE);
	pageContext.setAttribute("pwd",pwd,pageContext.SESSION_SCOPE);


		%>

</body>
</html>
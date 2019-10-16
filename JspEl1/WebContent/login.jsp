<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User Name : ${param.t1 }<br/>
Password : ${param.t2 }


<%
	String user=request.getParameter("t1");
	String pass=request.getParameter("t2");
	
	/* session.setAttribute("usr",user);
	session.setAttribute("pass",pass); */
	
	Cookie c=new Cookie("usr",user);
	response.addCookie(c);
	
	Cookie c1=new Cookie("pass",pass);
	response.addCookie(c1);
	
	
	
		%>
		
		<a href="next.jsp">Next</a>

</body>
</html>
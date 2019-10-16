<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
</head>
<body>

	<nav class="navbar navbar-inverted">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="https://www.codeSeeker.com">CodeSeeker</a>
			</div>
			<ul class="nav navbar-nav">
			
			<li class="active"><a href="index.jsp">Home</a></li>
			<li><a href="login.html">Login</a></li>
      		<li><a href="view.html">View</a></li>
      		<li><a href="logout.html">Logout</a></li>
      		
      		</ul>
		</div>

	</nav>
	<%@ page import="jspSession.bean" %>
	
<% 
	String email=request.getParameter("email");
	String pass=request.getParameter("pwd");
	
	bean b=new bean();
	
	if(email.equals("admin@123.com") && pass.equals("admin"))
	{
		HttpSession s=request.getSession();
		s.setAttribute("bean", b);
		
		b.setFlag(true);
		b.setEmail(email);
		b.setPassword(pass);
		response.sendRedirect("index.jsp");
	}
	else
	{
		response.sendRedirect("index.jsp");
	}

		%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Session Implicit</title>

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
      		<li style="visibility: hidden" id="logout"><a href="logout.jsp">Logout</a></li>
      		
      		</ul>
		</div>

	</nav>
			
		<%@ page import="jspSession.bean" %>
		<% 
			HttpSession s=request.getSession();
			bean b=(bean) s.getAttribute("bean");
		
			if(b==null)
			{
				out.print("Please login in order to continue");
			}
			else
			{
				if(b.isFlag())
				{
					out.print("<h1 id=true>Logged in "+b.getEmail()+"</h1>");
					out.print("<script>document.getElementById("+"logout"+").style.visibility="+"visible"+" </script>");
					
				}
				else
				{
					out.print("Please login in order to continue");
				}
			}
		
				%> 
</body>
</html>
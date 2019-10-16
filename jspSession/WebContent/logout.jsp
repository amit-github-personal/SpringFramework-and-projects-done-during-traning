<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>

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
      		<li class="inactive"><a href="logout.html">Logout</a></li>
      		
      		</ul>
		</div>

	</nav>
	
	
	
	<% HttpSession sess=request.getSession();
		
		sess.invalidate();
		
		out.print("logged out successfully");
		out.println("<a href=index.jsp>Click here to go to home</a>");
	%>


</body>
</html>
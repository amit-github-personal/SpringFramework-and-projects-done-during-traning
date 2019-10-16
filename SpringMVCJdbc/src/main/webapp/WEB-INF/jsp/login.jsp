<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login Page.</h1>

<h2>${message}</h2><br/>

<div class="container" style="alignment: center;">
<form action="usercheck" method="post">
<label>UserName:</label>
<input name="user"/><br/><br/>
<label>Password: </label>
<input name="pass" type="password"/><br/><br/>
<input type="submit" value="Login">
</form>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h3>${message }</h3>

<form action="login">
<label>Username:</label>
<input type="text" name="username"><br/>
<label>Password:</label>
<input type="password" name="password"><br/>
<input type="submit" value="Login">
</form>

</body>
</html>
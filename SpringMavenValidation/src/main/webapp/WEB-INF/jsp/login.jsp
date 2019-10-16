<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error
{
 color:red;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>${message }</h1>

<form action="loginu" modelAttribute="bean" method="post">
Username:<br/>
<input type="text" name="user"><br/>
Password:<br/>
<input type="password" name="password"><br/>
<form:errors path="password" cssClass="error"></form:errors><br/><br>
<input type="submit" value="login">

</form>

</body>
</html>
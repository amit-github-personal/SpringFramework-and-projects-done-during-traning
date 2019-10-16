<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

.error
{
 color:red;
}

</style>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<form:form action="store" modelAttribute="bean" method="post">
<label>Username:</label><br/>
<form:input path="user"/>
<form:errors path="user" cssClass="error"></form:errors><br/>
<label>Password:</label><br/>
<form:input path="password"/>
<form:errors path="password" cssClass="error"></form:errors><br/>
<label>Age:</label><br/>
<form:input path="age"/>
<form:errors path="age"></form:errors><br/>
<input type="submit" value="Register">
</form:form>

</body>
</html>
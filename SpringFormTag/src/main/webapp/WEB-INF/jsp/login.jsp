<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form:form action="user/validate" modelAttribute="bean" method="post">
<label>UserName:</label><br/>
<form:input path="username" /><br/>
<label>Password: </label><br/>
<form:password path="password"/><br/>
<label>Gender: </label><br/>
<form:radiobutton path="gender" value="Male"/>Male
<form:radiobutton path="gender" value="Female"/>Female<br/>
<input type="submit" value="Login">
</form:form>

</body>
</html>
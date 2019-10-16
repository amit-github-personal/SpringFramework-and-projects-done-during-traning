<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Email</title>
</head>
<body>

<c:form action="send" modelAttribute="user">
<label>Username</label>
<c:input path="username" name="username"/><br/><br/>
<label>Email:</label>
<c:input path="email" name="email"/><br/><br/>
<label>To:</label>
<c:input path="to"/><br/><br/>
<label>Message:</label>
<c:textarea path="message"/><br/><br/>
<label>Sub: </label>
<c:input path="sub"/><br/><br/>
<input type="submit">

${message }

</c:form>

</body>
</html>
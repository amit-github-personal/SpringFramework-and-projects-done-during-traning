<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>In Next Page</title>
</head>
<body>

User Name : ${sessionScope.usr}<br/>
Password : ${sessionScope.pass }<br/>

<hr>

<h1>Using Cookies</h1>
User Name : ${cookie.usr.value}<br/>

Password : ${cookie.pass.value}<br/>

</body>
</html>
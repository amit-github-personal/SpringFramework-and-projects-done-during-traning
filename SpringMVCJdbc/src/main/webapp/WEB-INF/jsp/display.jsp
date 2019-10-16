<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Display page</title>
</head>
<body>

<div class="container">
<h1>Displaying Records.</h1>
<table class="table table-hover" style="hover: DodgerBlue;">

<thead>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>UserName</th>
<th>Mobile</th>
<th>Address</th>
</tr>
</thead>
<tbody>
<c:forEach var="tab" items="${data }">
<tr>
<td>${tab.id }</td>
<td>${tab.name }</td>
<td>${tab.email }</td>
<td>${tab.username }</td>
<td>${tab.mobile }</td>
<td>${tab.address }</td>
</tr>
</c:forEach>
</tbody>

</table>
</div>


</body>
</html>
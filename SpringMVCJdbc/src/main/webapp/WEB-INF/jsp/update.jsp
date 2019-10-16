<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

    <%@page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<form action="check">

<h1>Updation Page</h1>
<h3>Please Enter ID: </h3>
<input type="number" name="id">
<input type="submit" value="Find">
</form>

${msg }

<div class="container">
<h1>Displaying Records.</h1><br>


<form action="edit" method="post">
<table class="table table-hover" style="hover: DodgerBlue;">

<thead>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>UserName</th>
<th>Mobile</th>
<th>Address</th>
<th>Edit</th>
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
<td><input type="submit" value="Edit"></td>
</tr>


</c:forEach>
</tbody>

</table>
</form>
</div>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="signin" modelAttribute="bean" method="post">

	<label>UserName: </label><br/>
		<input type="text" name="user"><br/>
			<label>Password: </label><br/>
		<input type="password" name="pass"><br/>
	<input type="submit" value="Login">

</form>

</body>
</html>
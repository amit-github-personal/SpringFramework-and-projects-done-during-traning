<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Jsp Page</title>
	</head>
	<body>
		<h1>Files Upload !</h1>
		<form action="fileup" method="post" enctype="multipart/form-data">
			File to upload : <input type="file" name="upfile" multiple><br>
			<input type="submit" value="upload">
		</form>
	</body>
</html>
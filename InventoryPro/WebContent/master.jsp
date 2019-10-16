<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="design.css">
<title>Stock</title>
</head>
<body>
<Center><h1>Stock</h1></Center>

<div class="second">
<form action="stock" method="post">
<label>Item Code : </label><br/>
<input type="number" name="t1"><br/>
<label>Item Name :</label> <br>
<input type="text" name="t2"><br/>
<label>Quantity :</label><br/>
<input type="number" name="t3"><br/>
<label>Rate :</label><br/>
<input type="number" name="t4"><br/>
<label>Amount :</label><br/>
<input type="number" name="t5"><br/>
<label>Date of Purchase :</label><br/>
<input type="date" name="t6"><br/><br/>

<input type="submit" value="Submit">

	</form>


		</div>

</body>
</html>
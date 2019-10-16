<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="info" class="com.bean.Student"></jsp:useBean>
<jsp:setProperty property="*" name="info"/>

<br/>
Student Information : <br/>

Student Roll No : <jsp:getProperty property="roll" name="info"/><br/>
Student Name : <jsp:getProperty property="sname" name="info"/><br/>
Course : <jsp:getProperty property="cname" name="info"/><br/>


</body>
</html>
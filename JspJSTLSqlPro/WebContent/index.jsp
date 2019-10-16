<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="con"
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe"
	user="system"
	password="system"
/>
<sql:query var="rs" dataSource="${con }">
	select * from emp101
</sql:query>
<c:forEach var="tab" items="${rs.rows }">
	<hr>
	<br/> Ename <c:out value="${tab.ename }"></c:out>
	<br/> Pass <c:out value="${tab.pass }"></c:out>
	<br/> Email <c:out value="${tab.email }"></c:out>
	<br/> Mobile <c:out value="${tab.mobile }"></c:out>
</c:forEach>
</body>
</html>
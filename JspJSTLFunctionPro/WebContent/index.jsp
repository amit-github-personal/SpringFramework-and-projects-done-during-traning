<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="x" value="Welcome to you" />
<c:if test="${fn:contains(x,'you') }">
	<br>
	<c:out value="String exist"></c:out>
</c:if>
<h1>${fn:indexOf(x,'you') }</h1>
<br>
<h3>${fn:toLowerCase(x)}</h3>
</body>
</html>
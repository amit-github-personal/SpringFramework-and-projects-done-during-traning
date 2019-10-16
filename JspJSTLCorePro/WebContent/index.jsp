<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tag's</title>
</head>
<body>
<c:out value="Welcome to JSTL"></c:out>
<c:set var="msg" value="Happy Birthday to you"></c:set>
<br />
<c:out value=" ${msg }"></c:out>
<br/ >
<c:set var="basic" value="30000"></c:set>
<br/>
<c:out value=" ${basic }"></c:out>
<c:if test="${basic>20000 }">
	<br />
	<c:out value="Good Salary"></c:out>
</c:if>
<br />
<c:if test="${basic<20000 }">
	<br />
	<c:out value="It's Okay"></c:out>
</c:if>
<c:set var="n" value="101"></c:set> <br/>
<c:if test="${n%2==0 }">
	<c:out value="Even number"></c:out>
</c:if>
<c:if test="${n%2!=0 }"> <br/>
	<c:out value="Odd number"></c:out>
</c:if>
<c:choose>
	<c:when test="${num>0 }">
		<br /><c:out value="Negative"></c:out>
	</c:when>
	<c:otherwise>
		<br /><c:out value="Zero"></c:out>
		
	</c:otherwise>
</c:choose>
<c:forEach begin="1" end="10" var="i">
	<br /><c:out value="${i }"></c:out>
</c:forEach>
<c:catch var="x">
	<% int z=56/0; %>
</c:catch>
<c:if test="${x!=null }">
	<br/> <c:out value="${x }"></c:out>
</c:if>
<c:forTokens items="All is Well" delims=" " var="str">
	<br/> <c:out value="${str }"></c:out>
</c:forTokens>
<c:forTokens items="1:57:53pm" delims=":" var="str">
	<br/> <c:out value="${str }"></c:out>
</c:forTokens>
<c:forEach begin="0" end="9" var="i">
	<br /><c:out value="${10-i }"></c:out>
</c:forEach>

</body>
</html>
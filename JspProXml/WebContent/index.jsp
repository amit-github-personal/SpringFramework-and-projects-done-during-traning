<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="veg">
	<vegtables>
		<vegtable>
			<veg-name>Potato</veg-name>
			<veg-price>20.00</veg-price>
		</vegtable>
		<vegtable>
			<veg-name>Tomato</veg-name>
			<veg-price>80.00</veg-price>
		</vegtable>
		<vegtable>
			<veg-name>onion</veg-name>
			<veg-price>25.00</veg-price>
		</vegtable>
	</vegtables>
</c:set>
<x:parse var="sabzi" xml="${veg }"/> <br>
Vegtable Name :<x:out select="$sabzi/vegtables/vegtable[1]/veg-name"/><br>
Vegtable Price :<x:out select="$sabzi/vegtables/vegtable[1]/veg-price"/><br>
Vegtable Name :<x:out select="$sabzi/vegtables/vegtable[2]/veg-name"/><br>
Vegtable Price :<x:out select="$sabzi/vegtables/vegtable[2]/veg-price"/><br>
Vegtable Name :<x:out select="$sabzi/vegtables/vegtable[3]/veg-name"/><br>
Vegtable Price :<x:out select="$sabzi/vegtables/vegtable[3]/veg-price"/><br>

<x:if select="$sabzi/vegtables/vegtable[2]/veg-price>30">
	<br> Tomato Price is high 
</x:if>
<x:if select="$sabzi/vegtables/vegtable[1]/veg-price>20">
	<br> Potato Price is high 
</x:if>
<x:if select="$sabzi/vegtables/vegtable[3]/veg-price>20">
	<br> Onion Price is high 
	<br>
</x:if>
<x:choose>
	<x:when select="$sabzi/vegtables/vegtable[2]/veg-price>30">
		<br>Tomato Price is High
	</x:when>
	<x:when select="$sabzi/vegtables/vegtable[1]/veg-price>20">
		<br>Potato Price is High
	</x:when>
	<x:when select="$sabzi/vegtables/vegtable[3]/veg-price>20">
		<br>Onion Price is High
	</x:when>
	<x:otherwise>
		<br> Price is Okay !!!!
	</x:otherwise>
</x:choose>
<br>
<x:forEach select="$sabzi/vegtables/vegtable" var="y"> <br>
	Vegtable Name: <x:out select="$y/veg-name"/> <br>
	Vegtable Price: <x:out select="$y/veg-price"/> <br>
</x:forEach>
<br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
</head>
<body>

username : ${user.name}</br>
gender   : ${user.gender }</br>
Country  : ${user.country }</br>
Introduction : ${user.introduction }</br>

<p>visited countries : 

	<c:forEach var="country" items="${user.visitedCountries}">
		<li>${country}</li>
	</c:forEach>

</p>

</body>
</html>
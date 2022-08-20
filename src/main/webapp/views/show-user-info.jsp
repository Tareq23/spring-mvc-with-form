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

	<p>name : ${user.name}</p>
	<p>email : ${user.email }</p>
	<p>gender: ${user.gender }</p>
	<p>
		Visited Country List : 
		<c:forEach items="${user.visitedCountries}" var="country">
			<c:out value="${country}"></c:out>
		</c:forEach>
	</p>

</body>
</html>
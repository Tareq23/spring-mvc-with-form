<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
	
	
	<p>${welcome}</p>
	
	<div class="container">
	
		<div class="col-sm-10">
			
			<ul>
			
				<li><a href="${pageContext.request.contextPath}/view-user">View Users</a></li>
				<li><a href="${pageContext.request.contextPath}/add-user">Add User</a></li>
				
			</ul>
		
		</div>
	
	</div>
	
</body>
</html>
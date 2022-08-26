<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>


		<div class="container">
		
			<div class="col-sm-10">
			
				<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">Name</th>
				      <th scope="col">Email</th>
				      <th scope="col">Password</th>
				    </tr>
				  </thead>
				  <tbody>
				   	<c:forEach items="${users}" var="user">
				   	
				   		<tr>
				   			<td>${user.userName}</td>
				   			<td>${user.userEmail}</td>
				   			<td>${user.userPassword}</td>
				   		</tr>
				   	
				   	</c:forEach>
				  </tbody>
				</table>
			
			</div>
		
		</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New User</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

	<div class="container">
	
		<div class="col-sm-8 m-auto">
			<p class="mt-5">Add New User</p>
			<form:form modelAttribute="user" action="${pageContext.request.contextPath}/add-user" method="post">
			 <div class="form-group">
			    <label for="exampleInputName">Your Name</label>
			    <form:errors path="userName" class="text-danger" />
			    <form:input  path="userName" type="text" class="form-control" id="exampleInputName" value=""  placeholder="Enter Your name"/>
			    
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail1">Email address</label>
			    <form:errors path="userEmail" class="text-danger" />
			    <form:input path="userEmail"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
			    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <form:errors path="userPassword" class="text-danger" />
			    <form:input path="userPassword" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
					
		</div>
		
	</div>

</body>
</html>
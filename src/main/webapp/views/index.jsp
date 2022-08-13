<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>


	<div class="container mt-3">
	
		
<form:form action="user-register" modelAttribute="user">
	<div class="form-group row">
    <label for="inputName" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
    	<form:input type="text" path="name" class="form-control" id="inputName" placeholder="Full name"/>
      <!-- <input type="text" class="form-control" id="inputName" placeholder="Full Name"> -->
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
    <form:input type="email" path="email" class="form-control" id="inputEmail3" placeholder="Email"/>
      <!-- <input type="email" class="form-control" id="inputEmail3" placeholder="Email"> -->
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <form:input path="password" type="password" class="form-control" id="inputPassword3" placehodler="Password"/>
      <!-- <input type="password" class="form-control" id="inputPassword3" placeholder="Password"> -->
    </div>
  </div>
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Gender</legend>
      <div class="col-sm-10">
        <!-- <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            First radio
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
            Second radio
          </label>
        </div> -->
        <div class="form-check">
        	<form:radiobutton path="gender" label="Male" class="form-check-input" id="gridRadios2" value="Male" />
        </div>
        <div class="form-check">
        	<form:radiobutton path="gender" label="Female" class="form-check-input" id="gridRadios3" value="Female" />
        </div>
        
       <!-- <div class="form-check disabled">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" disabled>
          <label class="form-check-label" for="gridRadios3">
            Third disabled radio
          </label>
        </div> -->
      </div>
    </div>
<!--   </fieldset>
  <div class="form-group row">
    <div class="col-sm-2">Checkbox</div>
    <div class="col-sm-10">
      <div class="form-check">
        <input class="form-check-input" type="checkbox" id="gridCheck1">
        <label class="form-check-label" for="gridCheck1">
          Example checkbox
        </label>
      </div>
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div> -->
</form:form>
		
	
	</div>

</body>
</html>
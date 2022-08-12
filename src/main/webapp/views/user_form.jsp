<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="display-user-info" modelAttribute="user">
	
		<p>
			Name : <form:input path="name"/>
			Gender : <form:radiobuttons path="gender" items="${genderMap}"/>
		</p>
		<p>
			<!-- <form:select path="country">
				<form:option value="Bangladesh" label="Bangladesh"></form:option>
				<form:option value="India" label="India"></form:option>
				<form:option value="Pakistan" label="Pakistan"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="Russia" label="Russia"></form:option>
			</form:select> -->
			
			<form:select path="country" items="${countryMap }">
				
			</form:select>
		</p>
		<p>
			<form:textarea path="introduction"/>
		</p>
		
			<p>
				Istambul <form:checkbox path="visitedCountries" value="Istambul"/>
			Pakistan <form:checkbox path="visitedCountries" value="Pakistan"/>
			Iran <form:checkbox path="visitedCountries" value="Iran"/>
			Irak <form:checkbox path="visitedCountries" value="Irak"/>
			Saudi Arab <form:checkbox path="visitedCountries" value="Saudi Arab"/>
			Egept <form:checkbox path="visitedCountries" value="Egept"/>
			</p>
		
		
		
		
		<input type="submit" value="submit"/>
		
	
	</form:form>


</body>
</html>
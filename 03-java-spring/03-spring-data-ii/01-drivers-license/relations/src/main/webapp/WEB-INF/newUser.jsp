<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New User</title>
	</head>
	<body>
		<a href="/licenses/new">New License</a>
		<form:form action="/persons/new" method="POST" modelAttribute="person">
			<p>
				<form:label path="firstName">FirstName:</form:label>
				<form:errors path="firstName"/>
				<form:input path="firstName"/><!--This will connect to the model page title variable-->
			</p>
			<p>
				<form:label path="lastName">LastName:</form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName"/>
			</p>		
			<button>Create</button>
		</form:form>
	</body>
</html>
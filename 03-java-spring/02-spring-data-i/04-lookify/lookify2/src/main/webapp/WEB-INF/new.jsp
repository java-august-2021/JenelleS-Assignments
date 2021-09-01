<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Song</title>
	</head>
	<body>
		<a href="/dashboard">Dashboard</a>
		<form:form action="/new" method="POST" modelAttribute="song">
		<p>
			<form:label path="title">Title:</form:label>
			<form:errors path="title"/>
			<form:input path="title"/><!--This will connect to the model page title variable-->
		</p>
		<p>
			<form:label path="artist">Artist:</form:label>
			<form:errors path="artist"/>
			<form:input path="artist"/>
		</p>
		<p>
			<form:label path="rating">Rating:</form:label>
			<form:errors path="rating"/>
			<form:input  type="number" min="1" max="10" path="rating"/>
		</p>
		
		<button>Add Song</button>
		</form:form>
	</body>
</html>
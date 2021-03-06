<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Dojo Page</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<a href="/dojos">Add a dojo</a>
			<a href="/ninjas">Register a new Ninja</a>
			<h1><c:out value="${dojo.name}"/>'s Ninjas</h1>
			<table class="table">
				<tr class="table-info">
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
				<c:forEach items="${dojo.ninjas}" var="ninja">
					<tr>
						<td><c:out value="${ninja.firstName}"/></td>
						<td><c:out value="${ninja.lastName}"/></td>
						<td><c:out value="${ninja.age}"/></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>
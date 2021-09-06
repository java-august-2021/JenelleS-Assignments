<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Id</title>
	</head>
	<body>
		<p><c:out value="${person.firstName}"/></p>
		<p><c:out value="${license.number}"/></p>
		<p><c:out value="${license.state}"/></p>
		<p><c:out value="${license.expiration_date}"/></p>
		<p><a href="/persons/new">New person</a></p>
	</body>
</html>
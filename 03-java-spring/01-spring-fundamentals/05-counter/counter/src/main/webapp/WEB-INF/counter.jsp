<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Counter</title>
	</head>
	<body>
		<p>You have visited <a href="#">http://localhost:8080/</a> <c:out value="${countToShow}"/> times.</p>
		<a href="http://localhost:8080/">Test another visit?</a>
	</body>
</html>
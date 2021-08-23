<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="displaydate.css">
		<script src="displaydate.js"></script>
		<title>Time</title>
	</head>
	<body>
		<fmt:formatDate pattern="h:m a" value="${time}" />
		<a href="http://localhost:8080">Main Page</a>
	</body>
</html>
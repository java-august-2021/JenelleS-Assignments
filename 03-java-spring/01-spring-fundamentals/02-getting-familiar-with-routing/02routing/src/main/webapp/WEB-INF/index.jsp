<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome Page</title>
	</head>
	<body>
		<h1>Welcome <c:out value="${userName}"/>!</h1><!-- the value connects to the key in the model addAttribute("HERE",not here) -->
		<c:out value="${search}"/><!-- connects to the controller page search query model attribute -->
		<!-- to use a search query type in the url "/?q=what you are searching" -->
		<!-- NEEDs JSTL FOR C:OUT TO WORK!!!!! -->
	</body>
</html>
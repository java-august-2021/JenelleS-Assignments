<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title><c:out value="${lang.name}"/></title>
	</head>
	<body>
		<a href="/">Main</a>
      	<p><c:out value="${lang.name}"/></p>
		<p><c:out value="${lang.creator}"/></p>
		<p><c:out value="${lang.currentVersion}"/></p>
		<p><a href="/edit/${lang.id}">Edit</a></p> 
		<a href="/delete/${lang.id}">Delete</a>
	</body>
</html>
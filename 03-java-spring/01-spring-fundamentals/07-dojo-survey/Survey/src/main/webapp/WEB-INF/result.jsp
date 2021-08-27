<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Results of Survey</title>
	</head>
	<body>
		<div>
			<p><c:out value="${name}"/></p>
			<p><c:out value="${location}"/></p>
			<p><c:out value="${language}"/></p>
			<p><c:out value="${comment}"/></p>
		</div>
	</body>
</html>
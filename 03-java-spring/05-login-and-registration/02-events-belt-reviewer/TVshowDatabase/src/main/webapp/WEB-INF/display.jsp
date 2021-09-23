<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edit My Show</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			
			<h1><c:out value="${thisShow.title}"/></h1><!-- Select the property off the model -->
			<a href="/shows">Back To Dashboard</a>
			<p>Posted by: <c:out value="${user.name}"/></p>
			<p>Network: <c:out value="${thisShow.network}"/></p>
			<p>Description <c:out value="${thisShow.description}"/></p>
			<a href="/shows/${thisShow.id}/edit">Edit</a>
		</div>
	</body>
</html>
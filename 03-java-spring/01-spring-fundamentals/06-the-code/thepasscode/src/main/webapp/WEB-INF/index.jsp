<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>the Code</title>
	</head>
	<body>
		<h1>What is the code?</h1>
		<p>
			<!--<c:out value="${errors}"/>-->
			<form method="POST" action="/submit">
				<input type="text" name="submit" required minlength="4" maxlength="8" size="10">
				<button>Try Code</button>
			</form>
		</p>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Top 10</title>
	</head>
	<body>
		<h1>Top 10 songs:</h1>
		<a href="/dashboard">Dashboard</a>
			<c:forEach items="${allSongs}" var="song">
				<div>
					<c:out value="${song.rating}"/> - 
					<a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - 
					<c:out value="${song.artist}"/>
				</div>
			</c:forEach>
	</body>
</html>
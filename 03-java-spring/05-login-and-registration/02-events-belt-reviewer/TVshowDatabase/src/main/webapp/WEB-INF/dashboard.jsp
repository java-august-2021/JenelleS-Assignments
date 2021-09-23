<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Project Manager Dashboard</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
				<h1>Welcome, <c:out value="${user.name}"/></h1>
				<a href="/logout">Log out</a>
				<h3>TV Shows</h3>
			<table border = 1>
				<thead>
		        	<tr>
		            	<th>Show</th>
		            	<th>Network</th>
		            	<th>Average Rating</th>
		        	</tr>
				</thead>
				<tbody>
		    		<c:forEach items="${allShows}" var="shows">
		    			<tr>
		    				<td><a href="/shows/${shows.id}"><c:out value="${shows.title}"/></a></td>
							<td><c:out value="${shows.network}"/></td>
							<td><c:out value="${shows.ratings}"></c:out></td>
						</tr>
		         	</c:forEach>
				</tbody>
			</table>
		    <a href="/shows/new">Add a Show</a>
		</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Book view</title>
	</head>
	<body>
		<div>
			<a href="/create">Create</a>
		</div>
		<table border = 1>
			<thead>
		        	<tr>
		            	<th>Title</th>
		            	<th>Description</th>
		            	<th>Language</th>
		            	<th>Number of Pages</th>
		            	<th>Update</th>
		            	<th>Delete</th>
		        	</tr>
			</thead>
			<tbody>
		    	<c:forEach items="${allBooks}" var="b">
		        	<tr>
		            	<td><c:out value="${b.title}"/></td>
		     			<td><c:out value="${b.description}"/></td>
		     			<td><c:out value="${b.language}"/></td>
		     			<td><c:out value="${b.numberOfPages}"/></td>
		     			<td><a href="/update/${b.id}">Update</a></td>
		     			<td><a href="/delete/${b.id}">Delete</a></td>
		    		</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>
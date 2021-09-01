<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lookify!</title>
	</head>
	<body>
		<a href ="/new">Add New</a> |
		<a href = "/topTen">Top Songs</a> |
		<form action="/search">
			<input type="text" name="artist"/>
			<button class="btn btn-primary">Search Artists</button>
		</form>	
		<table border = 1>
			<thead>
				<tr>
					<th>Title</th>
	            	<th>Rating</th>
	            	<th>Action</th>
				</tr>
			</thead>
			<tbody>
				 <c:forEach items="${allSongs}" var="song">
		        	<tr>
		            	<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
		     			<td><c:out value="${song.rating}"/></td>
						<td>
		            		<a href ="/delete/${song.id}">Delete</a>
						</td>
		    		</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>
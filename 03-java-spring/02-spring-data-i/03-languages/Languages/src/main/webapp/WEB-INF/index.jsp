<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Languages</title>
	</head>
	<body>
		<table border = 1>
			<thead>
		        	<tr>
		            	<th>Name</th>
		            	<th>Creator</th>
		            	<th>Current Version</th>
		            	<th>Action</th>
		        	</tr>
			</thead>
			<tbody>
		    	<c:forEach items="${allLanguages}" var="l">
		        	<tr>
		            	<td><a href="/show/${l.id}"><c:out value="${l.name}"/></a></td>
		     			<td><c:out value="${l.creator}"/></td>
		     			<td><c:out value="${l.currentVersion}"/></td>
		     			<td><a href="/edit/${l.id}">Edit</a> | <a href="/delete/${l.id}">Delete</a></td>
		    		</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
		<form:form action="/" method="POST" modelAttribute="lang">
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name"/><!--This will connect to the model page name variable-->
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="currentVersion">Current Version:</form:label>
			<form:errors path="currentVersion"/>
			<form:input path="currentVersion"/>
		</p>
		<button>Submit</button>
		</form:form>
		</div>
	</body>
</html>
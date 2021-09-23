<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create a Show</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
					<h1>Create a New TV Show</h1>
			<form:form action="/shows/new" method="POST" modelAttribute="show">
				<p>
					<form:label path="title">Title:</form:label>
					<form:errors path="title"/>
					<form:input path="title"/><!--This will connect to the model page name variable-->
				</p>	
				<p>
					<form:label path="network">Network:</form:label>
					<form:errors path="network"/>
					<form:input path="network"/><!--This will connect to the model page name variable-->
				</p>
				<p>
					<form:label path="description">Description:</form:label>
					<form:errors path="description"/>
					<form:input path="description"/><!--This will connect to the model page name variable-->
				</p>
				    
				<button>Submit</button>|<a href="/shows">Cancel</a>
			</form:form>
		</div>
	</body>
</html>
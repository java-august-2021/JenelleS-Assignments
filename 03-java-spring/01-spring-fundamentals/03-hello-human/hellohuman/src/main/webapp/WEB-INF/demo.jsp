   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
        <link rel="stylesheet" type="text/css" href="style.css">
        <script type="text/javascript" src="app.js"></script>
		<title>Demo jsp</title>
	</head>
	<body>
		<h1>Welcome to Demo!</h1>
		
    	<!-- Inserting a for loop into your jsp -->
    	<p><% for(int i = 0; i < 5; i++) { %>
    		<h1><%= i %></h1>
    	<% } %></p>
    	
    	<!-- here we have to import the Date class. You will put the import in the first line of the jsp tag. Use the import attribute -->
    	<p>The time is: <%= new Date() %></p>

		<!-- getting the value for the name parameter -->
    	<!-- <p><% String req = request.getParameter("name"); %></p> -->
    	<!-- displaying the value -->
    	<!-- <h1><%= req %></h1>-->
    	<h2><c:out value="${2+2}"/></h2>
    	<c:out value="${dojoName}"></c:out> <!-- future reference -->
	</body>
</html>
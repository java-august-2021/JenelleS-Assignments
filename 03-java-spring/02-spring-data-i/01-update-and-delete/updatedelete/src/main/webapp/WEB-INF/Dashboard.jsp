<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/">Main</a>
		<form:form action="/update/${book.id}" method="POST" modelAttribute="book">
		<p>
			<form:label path="title">Title:</form:label>
			<form:errors path="title"/>
			<form:input path="title"/><!--This will connect to the model page title variable-->
		</p>
		<p>
			<form:label path="description">Description:</form:label>
			<form:errors path="description"/>
			<form:input path="description"/>
		</p>
		<p>
			<form:label path="language">Language:</form:label>
			<form:errors path="language"/>
			<form:input path="language"/>
		</p>
		<p>
			<form:label path="numberOfPages">Number of Pages:</form:label>
			<form:errors path="numberOfPages"/>
			<form:input  type="number" min="1" max="100" path="numberOfPages"/>
		</p>
		<button>Submit</button>
		</form:form>
</body>
</html>
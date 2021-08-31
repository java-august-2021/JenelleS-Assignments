<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title><c:out value="${lang.name}"/></title>
	</head>
	<body>
		<a href="/">Main</a> | <a href="/delete/${lang.id}">Delete</a>
		<form:form action="/edit/${lang.id}" method="POST" modelAttribute="lang"><!-- action connects to the request mapping on the controller page-->
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
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New License</title>
	</head>
	<body>
		<a href="/persons/new">New person</a>
		<form:form action="/licenses/new" method="POST" modelAttribute="license">
			<p>
				<form:label path="person">Person:</form:label>
				<form:errors path="person"/>
				<form:select class="form-control" path="person"><!--This will connect to the model page title variable-->
					<c:forEach items="${persons}" var="person">
						<option value="${person.id}">${person.firstName}</option>
					</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label path="state">State:</form:label>
				<form:errors path="state"/>
				<form:input path="state"/>
			</p>
			<p>
				<form:label path="expiration_date">Expiration_date:</form:label>
				<form:errors path="expiration_date"/>
				<form:input  type="date" min="1" max="10" path="expiration_date"/>
			</p>
			
			<button>Create</button>
		</form:form>
	</body>
</html>
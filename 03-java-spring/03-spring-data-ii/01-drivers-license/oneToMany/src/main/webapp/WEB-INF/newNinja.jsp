<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ninjas</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1>New Ninja</h1>
			<a href="/dojos">Add new Dojo</a>
			
			<form:form class="form" action="/ninjas" method="post" modelAttribute="ninja"><!-- model attribute in the controller -->
				<div class="form-group row">
					<form:label path="dojo">Select Dojo:</form:label>
					<form:select path="dojo">
						<c:forEach items="${allDojos}" var="dojo">
							<form:option value="${dojo.id}">
								<c:out value="${dojo.name}"/>
							</form:option>
						</c:forEach>
					</form:select>
				</div>				
				<div class="form-group row">
					<form:label path="firstName">First Name:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="firstName"/>
				</div>
				<div class="form-group row">
					<form:label path="lastName">Last Name:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="lastName"/>
				</div>
				<div class="form-group row">
					<form:label path="age">Age:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="age"/>
				</div>
				
				<input type="submit" class="btn btn-primary" value="Create"/>
			
			</form:form>
		</div>
	</body>
</html>
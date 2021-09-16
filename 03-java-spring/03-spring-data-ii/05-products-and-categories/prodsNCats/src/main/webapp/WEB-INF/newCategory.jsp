<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Ninja</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
				<a href="/newProduct">Register a new Product</a><!-- Look at model when creating your form -->
			<h1>New Category</h1>
			
			<form:form class="form" action="/newCategory" method="post" modelAttribute="category"><!-- model attribute in the controller -->
				<div class="form-group row">
					<form:label path="name">Name of Category:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="name"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Create"/>
			</form:form>
		</div>
	</body>
</html>
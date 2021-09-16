<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Product</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1>New Product</h1>
			<a href="/newCategory">Register a new Category</a>
			<form:form class="form" action="/newProduct" method="post" modelAttribute="product"><!-- model attribute in the controller -->
				<div class="form-group row">
					<form:label path="name">Name of Product:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="name"/>
				</div>
				<div class="form-group row">
					<form:label path="description">Description:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="text" path="description"/>
				</div>
				<div class="form-group row">
					<form:label path="price">Price:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:input type="number" path="price"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Create"/>
			</form:form>
		</div>
	</body>
</html>
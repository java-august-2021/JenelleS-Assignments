<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Product Page</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1><c:out value="${product.name}"/></h1>
			
			<div>
				<h2>Categories:</h2>
				<c:forEach items="${allCats}" var="category">
					<c:out value="${category.name}"/>
				</c:forEach>
			</div>
			
			<form class="form" action="/products/${product.id}" method="post"> 
				<div class="form-group row">
					<label path="categories">Add Category:</label>
					<select name="categories">
						<c:forEach items="${allNotCats}" var="category">
							<option value="${category.id}">
								<c:out value="${category.name}"/>
							</option>
						</c:forEach>
					</select>
				</div>				
				<input type="submit" class="btn btn-primary" value="Add"/>
			</form>
			<a href="/newCategory">Register a new Category</a>
			<a href="/newProduct">Register a new Product</a>
		</div>
	</body>
</html>
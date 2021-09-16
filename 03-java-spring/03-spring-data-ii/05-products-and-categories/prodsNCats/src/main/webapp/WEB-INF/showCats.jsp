<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Category Page</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1><c:out value="${category.name}"/></h1>
			
			<div>
				<h2>Products:</h2>
				<c:forEach items="${category.products}" var="product">
					<p><c:out value="${product.name}"/></p>
				</c:forEach>
			</div>
			
			<form class="form" action="/categories/${category.id}" method="post"> 
				<div class="form-group row">
					<label path="product">Add Product:</label>
					<select name="product">
						<c:forEach items="${allNotProds}" var="product">
							<option value="${product.id}">
								<c:out value="${product.name}"/>
							</option>
						</c:forEach>
					</select>
				</div>				
				<input type="submit" class="btn btn-primary" value="Add"/>
			</form>
		</div>
	</body>
</html>
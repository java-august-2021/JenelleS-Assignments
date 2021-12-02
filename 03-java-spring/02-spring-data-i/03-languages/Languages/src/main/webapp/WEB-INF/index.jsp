<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Languages</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container-md">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <div class="container-fluid">
			    <a class="navbar-brand" href="#">Tech Advances</a>
			    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
			    <div class="collapse navbar-collapse show" id="navbarNavAltMarkup">
			      <div class="navbar-nav">
			        <a class="nav-link active" aria-current="page" href="/">Home</a>
			      </div>
			    </div>
			  </div>
			</nav>
			<table class="table table-hover" border = 1>
				<thead>
			        	<tr>
			        		<th scope="col">Id number</th>
			            	<th scope="col">Name</th>
			            	<th scope="col">Creator</th>
			            	<th scope="col">Current Version</th>
			            	<th scope="col"></th>
			        	</tr>
				</thead>
				<tbody>
			    	<c:forEach items="${allLanguages}" var="l">
			        	<tr>
			        		<th scope="row"><c:out value="${l.id}"/></th>
			            	<td><a class="text-decoration-none" href="/show/${l.id}"><c:out value="${l.name}"/></a></td>
			     			<td><c:out value="${l.creator}"/></td>
			     			<td><c:out value="${l.currentVersion}"/></td>
			     			<td><a class="btn btn-outline-primary" href="/edit/${l.id}">Edit</a> <a class="btn btn-outline-primary" href="/delete/${l.id}">Delete</a></td>
			    		</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="btn-group">
				<a href="/new" class="btn btn-primary">New Item</a>
			</div>
			<nav class="navbar fixed-bottom navbar-light bg-light">
  				<div class="container-fluid">
    				<a class="navbar-brand" href="#">Jenelle Hanson</a>
  				</div>
			</nav>
		</div>
	</body>
</html>
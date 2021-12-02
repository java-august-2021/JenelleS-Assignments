<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Song</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<nav class="navbar navbar-expand-xl navbar-light" style="background-color: #e3f2fd;">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">Lookify</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarLight" aria-controls="navbarLight" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse show" id="navbarLight">
		      <ul class="navbar-nav me-auto mb-2 mb-xl-0">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="/dashboard">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="/new">Add New</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="/topTen">Top 10 songs</a>
		        </li>
		      </ul>
		      <form class="d-flex" action="/search">
		        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="artist">
		        <button class="btn btn-outline-primary" type="submit">Search Artists</button>
		      </form>
		    </div>
		  </div>
		</nav>
		<div class="container-md">
			<form:form action="/new" method="POST" modelAttribute="song">
				<div class="form-floating mb-2">
					<form:input path="title" class="form-control" id="floatingInput"/>
					<form:label path="title">Title:</form:label>
					<form:errors path="title"/>
				</div>
				<div class="form-floating mb-2">
					<form:input path="artist" class="form-control" id="floatingInput"/>
					<form:label path="artist">Artist:</form:label>
					<form:errors path="artist"/>
				</div>
				<div class="form-floating mb-2">
					<form:input type="number" min="1" max="10" path="rating" class="form-control" id="floatingInput"/>
					<form:label path="rating">Rating:</form:label>
					<form:errors path="rating"/>
				</div>
				<button class="btn btn-primary">Add Song</button>
			</form:form>
			<nav class="navbar fixed-bottom navbar-light bg-light">
  				<div class="container-fluid">
    				<a class="navbar-brand" href="#">Jenelle Hanson</a>
  				</div>
			</nav>
		</div>
	</body>
</html>
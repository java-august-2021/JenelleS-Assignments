<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New addition</title>
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
		<h1>New Addition:</h1>
			<form:form action="/new" method="POST" modelAttribute="lang">
				<div class="form-floating mb-2">
					<form:input path="name" class="form-control" id="floatingInput"/><!--This will connect to the model page name variable-->
					<form:label path="name" for="floatingInput" class="form-label">Name:</form:label>
					<form:errors path="name"/>
				</div>
				<div class="form-floating mb-2">
					<form:input path="creator" class="form-control" id="floatingInput"/>
					<form:label path="creator" for="floatingInput" class="form-label">Creator:</form:label>
					<form:errors path="creator"/>
				</div>
				<div class="form-floating mb-2">
					<form:input path="currentVersion" class="form-control" id="floatingInput"/>
					<form:label path="currentVersion" for="floatingInput" class="form-label">Current Version:</form:label>
					<form:errors path="currentVersion"/>
				</div>
				<button class="btn btn-primary">Submit</button>
			</form:form>
			<nav class="navbar fixed-bottom navbar-light bg-light">
  				<div class="container-fluid">
    				<a class="navbar-brand" href="#">Jenelle Hanson</a>
  				</div>
			</nav>
		</div>
	</body>
</html>
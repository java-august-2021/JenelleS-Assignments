<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Question</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<a href="/questions">Back to Dashboard</a><!-- Look at model when creating your form -->
			<h1>What is your question?</h1>
			
			<form:form class="form" action="/questions/new" method="post" modelAttribute="question"><!-- model attribute in the controller -->
				<div class="form-group row">
					<form:label path="questionTxt">Question:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:errors path="questionTxt"/>
					<form:input type="text" path="questionTxt"/>
				</div>
				<div class="form-group row">
					<form:label path="tags">Tags:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:errors path="tags"/>
					<form:input type="text" path="tags"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Submit"/>
			</form:form>
		</div>
	</body>
</html>
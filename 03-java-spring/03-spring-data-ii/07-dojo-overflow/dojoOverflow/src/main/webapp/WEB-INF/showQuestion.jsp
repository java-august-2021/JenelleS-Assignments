<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Question Profile</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1><c:out value="${question.questionTxt}"/></h1>
			<form:form class="form" action="/questions/${question.id}" method="post" modelAttribute="answer"><!-- model attribute in the controller -->
				<div class="form-group row">
					<form:label path="answerTxt">Answer:</form:label><!-- path= 'location' is a member variable in the model -->
					<form:errors path="answerTxt"/>
					<form:input type="text" path="answerTxt"/>
				</div>
				<input type="submit" class="btn btn-primary" value="Answer it!"/>
			</form:form>
			<c:forEach items="${question.answers}" var="answer">
				<p><c:out value="${answer.answerTxt}"/></p>
			</c:forEach>
			<a href="/questions">Back to Dashboard</a>
		</div>
	</body>
</html>
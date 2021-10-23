<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Questions Home</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	    <script src="/webjars/jquery/jquery.min.js"></script>
	    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<table class="table">
				<tr class="table-info">
					<th>Questions</th>
					<th>Tags</th>
				</tr>
				<c:forEach items="${allQuestions}" var="question">
					<tr>
						<td><c:out value="${question.questionTxt}"/><!-- link to question id and connect to the question answer and tag --></td>
						<td><c:out value="${question.tags}"/></td><!-- Figure out the reason why tags are not showing -->
					</tr>
				</c:forEach>
			</table>
			
			<a href="/questions/new">New Question</a>
		</div>
	</body>
</html>
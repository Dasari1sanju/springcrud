<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Student List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="row">Student Id</th>
					<th scope="row">First Name</th>
					<th scope="row">Last Name</th>
					<th scope="row">Email</th>
					<th scope="row">Phone</th>
					<th scope="row">Address</th>
					<th scope="row">Edit</th>
					<th scope="row">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${student_list }" var="student">
					<tr>
						<td>${student.StudentId }</td>
						<td>${student.firstName }</td>
						<td>${student.lastName }</td>
						<td>${student.email }</td>
						<td>${student.phone }</td>
						<td>${student.address }</td>
						<td><spring:url
								value="/student/update/${student.studentId }" var="updateURL" />
							<a class="btn btn-primary" href="${updateURL }" role="button">Update</a>
						</td>
						<td><spring:url
								value="/employee/delete/${student.studentId }" var="deleteURL" />
							<a class="btn btn-primary" href="${deleteURL }" role="button">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<spring:url value="/student/add" var="addURL"></spring:url>
		<a class="btn btn-primary" href="${addURL }" role="button">Add New
			Student</a>
	</div>
</body>
</html>
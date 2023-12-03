<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!-- Important keep in mind core_rt -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body style="color: silver;">
	<table border="1">
		<tr>
			<td colspan="5" align="center">Student Details</td>
		</tr>
		<tr>
			<td>Roll No</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>City</td>
			<td>Course</td>
		</tr>
		<c:forEach var="student" items="${student_data}">
			<tr>
				<td>${student.roll_no}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.city}</td>
				<td>${student.courseName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
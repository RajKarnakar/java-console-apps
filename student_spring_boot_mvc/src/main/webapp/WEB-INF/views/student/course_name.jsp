<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Details</title>
</head>
<body>
	<spring:url var="url" value="/student/student_details_course" />
	<form action="${url}" method="post">
		<h2>Student  Details By Course</h2>
		<table style="color: navy;">
			<tr>
				<td>Course Name</td>
				<td><input type="text" name="courseName" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit" /></td>
			</tr>
			</table>
	</form>
</body>
</html>
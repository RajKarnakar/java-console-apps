<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Admission System Home Page</title>
</head>
<body>
	<h5>
		<spring:url var="url1" value="/student/form" />
		<a href="${url1}">Add Student Detail</a>
	</h5>
	<h5>
		<spring:url var="url2" value="/student/student_details" />
		<a href="${url2}">View Student Detail</a>
	</h5>
	<h5>
		<spring:url var="url3" value="/student/student_details_course_wise" />
		<a href="${url3}">Display Student details as per course</a>
	</h5>
</body>
</html>
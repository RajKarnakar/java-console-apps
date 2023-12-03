<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Admission Form</title>
<style type="text/css">
	    body{
	    	background-color: silver;
	    }
	    form{
    		background: 10, 100, 120, 0.8;
    		border: 1px solid purple;
    		border-radius: 25px;
    		box-shadow: 5px 5px purple;
    		margin: auto;
    		height: 300px;
    		width: 400px;
    		padding: 20px;
    	}
    	table{
    		padding-left: 60px;
    	}
 		h2, td:last-child{
 			text-align: center;
 		}
    	input{
    		margin: 10px
    	}
    </style>
</head>
<body>
	<spring:url var="url" value="/student/student_process" />
	<form action="${url}" method="post">
    	<h2>Student Admission Form</h2>
      <table style="color:navy;" >
      	<tr>
          <td>Roll No</td>
          <td><input type="number" name="roll_no" /></td>
        </tr>
        <tr>
          <td>First Name</td>
          <td><input type="text" name="firstName" /></td>
        </tr>
        <tr>
          <td>Last Name</td>
          <td><input type="text" name="lastName" /></td>
        </tr>
        <tr>
          <td>city</td>
          <td><input type="text" name="city" /></td>
        </tr>
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
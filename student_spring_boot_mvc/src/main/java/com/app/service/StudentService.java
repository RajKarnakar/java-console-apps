package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	String addStudent(Student newStudent);

	List<Student> getStudentDetails();

	List<Student> getStudentDetailsByCourse(String course);
}

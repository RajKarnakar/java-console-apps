package com.app.dao;

import java.util.List;

import com.app.pojos.Student;

public interface StudentDao {
	String addStudent(Student newStudent);

	List<Student> getStudentDetail();
	
	List<Student> getStudentDetailByCourse(String course);

}

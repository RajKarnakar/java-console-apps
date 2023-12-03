package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDao;
import com.app.pojos.Student;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String addStudent(Student newStudent) {
		
		return studentDao.addStudent(newStudent);
	}

	@Override
	public List<Student> getStudentDetails() {
		
		return studentDao.getStudentDetail();
	}

	@Override
	public List<Student> getStudentDetailsByCourse(String course) {
		System.out.println("service"+course);
		return studentDao.getStudentDetailByCourse(course);
	}
}

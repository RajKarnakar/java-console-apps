package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	// dependency
	@Autowired
	private EntityManager mgr;

	@Override
	public String addStudent(Student newStudent) {
		mgr.persist(newStudent);
		return "Student added";
	}

	@Override
	public List<Student> getStudentDetail() {
		String jpql = "select s from Student s";
		return mgr.createQuery(jpql, Student.class).getResultList();
	}

	@Override
	public List<Student> getStudentDetailByCourse(String course) {
		String jpql = "select s from Student s where courseName=:course";
		System.out.println(course);
		return mgr.createQuery(jpql, Student.class).setParameter("course", course).getResultList();
	}

}

package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		System.out.println("In student controller " + getClass().getName());
	}
	
	@RequestMapping("/form")
	public String showForm(Model map, Student student) {
		System.out.println("In add student");
		return "/student/student_admission_form";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/student_process")
	public String addStudent(Model map, Student student) {
		System.out.println("In add student");
		map.addAttribute("msg",studentService.addStudent(student));
		return "/student/student_process";
	}
	
	@RequestMapping("/student_details")
	public String getStudentDetails(Model map) {
		System.out.println("In student details");
		map.addAttribute("student_data",studentService.getStudentDetails());
		return "/student/student_details";
	}
	@RequestMapping("/student_details_course_wise")
	public String getCourseName(String course) {
		
		return "/student/course_name";
	}
	@RequestMapping(method = RequestMethod.POST,value = "/student_details_course")
	public String getStudentDetailsByCourse(Model map,@RequestParam("courseName")String course) {
		System.out.println("In student course details");
		System.out.println("con "+course);
		map.addAttribute("student_data",studentService.getStudentDetailsByCourse(course));
		return "/student/student_details";
	}
}

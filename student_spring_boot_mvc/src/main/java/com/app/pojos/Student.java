package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student extends SuperEntity{
	//Rollno, StudentFirstName, StudentLastName, City, CourseName
	@Column(name="roll_no",unique=true)
	private int rollNo;
	@Column(name="first_name", length=30)
	private String firstName;
	@Column(name="last_name", length=30)
	private String lastName;
	@Column(name="city", length=20)
	private String city;
	@Column(name="course_name", length=25, nullable=false)
	private String courseName;
	
	
	public Student() {
	}
	
	public Student(int roll_no, String firstName, String lastName, String city, String courseName) {
		super();
		this.rollNo = roll_no;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.courseName = courseName;
	}
	public int getRoll_no() {
		return rollNo;
	}
	public void setRoll_no(int roll_no) {
		this.rollNo = roll_no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [id = " + getId() + ", roll_no=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", courseName=" + courseName + "]";
	}
		
}

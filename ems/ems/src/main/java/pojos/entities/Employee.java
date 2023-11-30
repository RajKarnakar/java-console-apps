package pojos.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// import javax.persistence.Transient;

import pojos.enums.EmplType;

@Entity
@Table(name = "emps")
public class Employee extends BaseEntity {

	@Column(name = "first_name", length = 15)
	private String firstName;

	@Column(name = "last_name", length = 15)
	private String lastName;

	@Column(length = 30, unique = true)
	private String email;

	@Column(length = 20, nullable = false)
	private String password;

//	@Transient
//	private String confirmPassword;

	@Column(name = "join_date")
	private LocalDate joinDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "type", length = 20)
	private EmplType emplType;

	private double salary;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department empDept;
	
	
	@ManyToMany(mappedBy = "projectMembers")
	private Set<Project> empProjects = new HashSet<>();


	// default constructor
	public Employee() {
		System.out.println("in default constructor of employee");
	}

	// all args constructor
	public Employee(String firstName, String lastName, String email, String password, LocalDate joinDate,
			EmplType emplType, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		this.emplType = emplType;
		this.salary = salary;
	}

	// getters/setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public EmplType getEmplType() {
		return emplType;
	}

	public void setEmplType(EmplType emplType) {
		this.emplType = emplType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}
	
	public Set<Project> getEmpProjects() {
		return empProjects;
	}

	public void setEmpProjects(Set<Project> empProjects) {
		this.empProjects = empProjects;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", joinDate=" + joinDate + ", emplType=" + emplType + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}

package pojos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "depts")
public class Department extends BaseEntity {

	@Column(name = "dept_name", length = 40, unique = true)
	private String deptName;

	@Column(length = 30)
	private String location;

	@OneToMany(mappedBy = "empDept", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> employees = new ArrayList<Employee>();

	public Department() {
	}

	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Departmant [id=" + getId() + ", deptName=" + deptName + ", location=" + location + "]";
	}

	public void addEmployee(Employee e) {
		employees.add(e);
		e.setEmpDept(this);
	}

	public void removeEmployee(Employee e) {
		employees.remove(e);
		e.setEmpDept(null);
	}
}

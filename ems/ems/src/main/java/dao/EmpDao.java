package dao;

import pojos.entities.Employee;

public interface EmpDao {

	String saveEmpDetails(Employee transientEmp, Long deptId);

	String removeEmpFromDept(String deptName, String email);
	
	Employee getEmpByEmail(String email);
}

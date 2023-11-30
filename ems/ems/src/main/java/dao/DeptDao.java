package dao;

import pojos.entities.Department;

public interface DeptDao {

	String addNewDepartment(Department dept);

	Department getDepartmentDetails(String deptName);

	Department getDepartmentAndEmployeeDetails(String deptName);

	Department getDepartmentAndEmployeeDetailsJoinFetch(String deptName);

	String removeDepartment(String deptName);
}

package tester.dept;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DeptDao;
import impl.DeptDaoImpl;
import pojos.entities.Department;

import static utils.HibernateUtils.getFactory;

public class TestGetDepartmentAndEmployeeDetailsJoinFetch {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			DeptDao dao = new DeptDaoImpl();
			System.out.println("Enter dept name");
			Department department = dao.getDepartmentAndEmployeeDetailsJoinFetch(sc.next());
			System.out.println("Dept details ");
			System.out.println(department);
			System.out.println("Emp details ");
			department.getEmployees().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

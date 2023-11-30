package tester.dept;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DeptDao;
import impl.DeptDaoImpl;
import pojos.entities.Department;

public class TestAddNewDepartment {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			DeptDao dDao = new DeptDaoImpl();

			System.out.println("Enter department details: deptName, location");
			
			System.out.println(dDao.addNewDepartment(new Department(sc.next(), sc.next())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
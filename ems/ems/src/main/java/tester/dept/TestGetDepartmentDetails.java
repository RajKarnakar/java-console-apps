package tester.dept;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DeptDao;
import impl.DeptDaoImpl;

import static utils.HibernateUtils.*;

public class TestGetDepartmentDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			DeptDao dDao = new DeptDaoImpl();

			System.out.println("Enter department name");
			System.out.println(dDao.getDepartmentDetails(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

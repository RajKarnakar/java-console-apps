package tester.dept;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DeptDao;
import impl.DeptDaoImpl;

public class TestRemoveDepartment {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			DeptDao dDao = new DeptDaoImpl();

			System.out.println("Enter department name");

			System.out.println(dDao.removeDepartment(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

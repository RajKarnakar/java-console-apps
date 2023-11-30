package tester.emp;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmpDao;

import impl.EmpDaoImpl;

public class TestRemoveEmpFromDept {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {

			EmpDao eDao = new EmpDaoImpl();
			System.out.println("Enter department name and employee email id");
			System.out.println(eDao.removeEmpFromDept(sc.next(), sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package tester.emp;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmpDao;
import impl.EmpDaoImpl;

import static utils.HibernateUtils.*;

public class TestGetEmpByEmail {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			EmpDao eDao = new EmpDaoImpl();
			System.out.println("Enter employee email");
			System.out.println(eDao.getEmpByEmail(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

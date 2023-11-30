package tester.addr;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddrDao;
import impl.AddrDaoImpl;

public class TestGetEmployeeAddress {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			AddrDao aDao = new AddrDaoImpl();

			System.out.println("Enter employee id ");

			System.out.println(aDao.getEmployeeAddress(sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

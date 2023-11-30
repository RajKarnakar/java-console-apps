package tester.addr;

import static utils.HibernateUtils.getFactory;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddrDao;
import impl.AddrDaoImpl;

public class TestGetLastNamesOfEmployeesByCity {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			AddrDao aDao = new AddrDaoImpl();

			System.out.println("Enter city ");

			String city = sc.next();
			List<String> lastNames = aDao.getLastNamesOfEmployeesByCity(city);

			if (lastNames.size() == 0) {
				System.out.println("No employees live in city " + city);
			} else {
				lastNames.forEach(System.out::println);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

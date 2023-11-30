package tester.addr;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddrDao;
import impl.AddrDaoImpl;
import pojos.entities.Address;

public class TestAddEmployeeAddress {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			AddrDao aDao = new AddrDaoImpl();

			System.out.println("Enter employee email ");
			String em = sc.next();
			System.out.println("Enter Address Details: adrLine1, adrLine2, city, state, country, zipCode");
			sc.nextLine();
			aDao.addEmployeeAddress(
					new Address(sc.nextLine(), sc.nextLine(), sc.next(), sc.next(), sc.next(), sc.next()), em);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

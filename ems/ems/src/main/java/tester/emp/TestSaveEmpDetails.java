package tester.emp;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmpDao;
import impl.EmpDaoImpl;
import pojos.entities.Employee;
import pojos.enums.EmplType;

import static utils.HibernateUtils.*;

public class TestSaveEmpDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			EmpDao eDao = new EmpDaoImpl();

			System.out.println(
					"Enter employee firstName, lastName, email, password, joinDate, emplType, salary, Department Id");

			System.out
					.println(
							eDao.saveEmpDetails(
									new Employee(sc.next(), sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next()),
											EmplType.valueOf(sc.next().toUpperCase()), sc.nextDouble()),
									sc.nextLong()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package impl;

import static utils.HibernateUtils.getFactory;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AddrDao;
import dao.EmpDao;
import pojos.entities.Address;
import pojos.entities.Employee;

public class AddrDaoImpl implements AddrDao {

	@Override
	public String addEmployeeAddress(Address empAddr, String email) {
		String mesg = "Assigning address to employee failed ...!";

		EmpDao eDao = new EmpDaoImpl();
		Employee emp = eDao.getEmpByEmail(email);

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			empAddr.setEmp(emp);
			session.save(empAddr);
			tx.commit();
			mesg = "Assigned adr to emp " + emp.getFirstName();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public String addEmployeeAddressById(Address addr, Long id) {
		String mesg = "Assigning address to employee failed ...!";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			Employee emp = session.get(Employee.class, id);

			if (emp != null) {
				addr.setEmp(emp);
				session.persist(addr);
				mesg = "Assigned adr to emp " + emp.getFirstName();
			}

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public String getEmployeeAddress(Long id) {
		String mesg = "Cannot get employee address";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			Employee emp = session.get(Employee.class, id);

			if (emp != null) {
				Address addr = session.get(Address.class, id);

				if (addr == null) {
					mesg = "address not assigned for employee Id: " + id;
				} else {
					mesg = "Address: " + addr;
				}

			} else {
				mesg = "Invalid employee id";
			}

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public List<String> getLastNamesOfEmployeesByCity(String city) {
		List<String> lastNames = new ArrayList<String>();

		String jpql = "select a.emp.lastName from Address a where a.city=:c";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			lastNames = session.createQuery(jpql, String.class).setParameter("c", city).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return lastNames;
	}

}

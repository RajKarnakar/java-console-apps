package impl;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.EmpDao;
import pojos.entities.Department;
import pojos.entities.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public String saveEmpDetails(Employee employee, Long deptId) {
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			Department dept = session.get(Department.class, deptId);

			if (dept != null) {
				dept.addEmployee(employee);
			}

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}

		return "Employee details added with ID " + employee.getId();
	}

	@Override
	public String removeEmpFromDept(String deptName, String email) {
		String mesg = "Removing employee failed ...!";
		String deptJpql = "select d from Department d where d.deptName=:nm";
		String empJpql = "select e from Employee e where e.email=:em";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {

			Department d = session.createQuery(deptJpql, Department.class).setParameter("nm", deptName)
					.getSingleResult();

			Employee e = session.createQuery(empJpql, Employee.class).setParameter("em", email).getSingleResult();

			d.removeEmployee(e);
			tx.commit();
			mesg = "Employee removed successfully";
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
		return mesg;
	}

	@Override
	public Employee getEmpByEmail(String email) {
		Employee validEmployee = null;

		String jpql = "select e from Employee e where e.email=:em";

		Session session = getFactory().getCurrentSession();

		Transaction tx = session.beginTransaction();

		try {
			validEmployee = session.createQuery(jpql, Employee.class).setParameter("em", email).getSingleResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
		return validEmployee;
	}

}

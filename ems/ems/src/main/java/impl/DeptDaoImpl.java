package impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.DeptDao;
import pojos.entities.Department;

import static utils.HibernateUtils.*;

public class DeptDaoImpl implements DeptDao {

	@Override
	public String addNewDepartment(Department dept) {
		String mesg = "Adding new dept failed ...!";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			session.persist(dept);
			tx.commit();
			mesg = "Added new dept with ID " + dept.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Department getDepartmentDetails(String deptName) {

		// d = s.createNativeQuery("select * from depts where dept_name=?",
		// Departmant.class)

		Department dept = null;

		String jpql = "select d from Department d where d.deptName=:name";
		// String jpql = "select * from depts where dept_name=:name";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			dept = session.createQuery(jpql, Department.class).setParameter("name", deptName).getSingleResult();
			// dept = session.createQuery(jpql, Departmant.class).setParameter("name",
			// deptName).getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return dept;
	}

	@Override
	public Department getDepartmentAndEmployeeDetails(String deptName) {
		Department dept = null;
		String jpql = "select d from Department d where d.deptName=:name";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			dept = session.createQuery(jpql, Department.class).setParameter("name", deptName).getSingleResult();
			dept.getEmployees().size();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return dept;
	}

	@Override
	public Department getDepartmentAndEmployeeDetailsJoinFetch(String deptName) {
		Department dept = null;
		String jpql = "select d from Department d left join fetch d.employees where d.deptName=:name";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			dept = session.createQuery(jpql, Department.class).setParameter("name", deptName).getSingleResult();
			dept.getEmployees().size();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return dept;
	}

	@Override
	public String removeDepartment(String deptName) {
		String mesg = "Department removal failed ...!";
		String jpql = "select d from Department d where d.deptName=:name";

		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			Department dept = session.createQuery(jpql, Department.class).setParameter("name", deptName)
					.getSingleResult();
			session.delete(dept);
			tx.commit();
			mesg = "Removed department successfully ...!";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}

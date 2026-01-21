package dao;

import java.util.List;

import entity.Employee;
import jakarta.persistence.EntityManager;
import util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	 @Override
	    public void save(Employee emp) {
	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        em.persist(emp);
	        em.getTransaction().commit();
	        em.close();
	    }

	    @Override
	    public void update(Employee emp) {
	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        em.merge(emp);
	        em.getTransaction().commit();
	        em.close();
	    }

	    @Override
	    public Employee findById(int id) {
	        EntityManager em = JPAUtil.getEntityManager();
	        Employee emp = em.find(Employee.class, id);
	        em.close();
	        return emp;
	    }

	    @Override
	    public List<Employee> findAll() {
	        EntityManager em = JPAUtil.getEntityManager();
	        List<Employee> list =
	                em.createQuery("from Employee", Employee.class).getResultList();
	        em.close();
	        return list;
	    }

	    @Override
	    public void delete(int id) {
	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        Employee emp = em.find(Employee.class, id);
	        if (emp != null) {
	            em.remove(emp);
	        }
	        em.getTransaction().commit();
	        em.close();
	    }
}

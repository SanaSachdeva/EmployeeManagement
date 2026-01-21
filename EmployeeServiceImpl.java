package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public void addEmployee(Employee emp) {
        dao.save(emp);
    }

    @Override
    public void updateEmployee(Employee emp) {
        dao.update(emp);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAll();
    }

    @Override
    public void deleteEmployee(int id) {
        dao.delete(id);
    }
}

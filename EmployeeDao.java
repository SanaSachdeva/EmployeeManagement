package dao;

import java.util.List;

import entity.Employee;

public interface EmployeeDao {
	void save(Employee emp);
    void update(Employee emp);
    Employee findById(int id);
    List<Employee> findAll();
    void delete(int id);
}

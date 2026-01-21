package service;

import java.util.List;

import entity.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);
    void updateEmployee(Employee emp);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void deleteEmployee(int id);
}

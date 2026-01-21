package controller;

import java.io.IOException;

import entity.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.EmployeeService;
import service.EmployeeServiceImpl;
@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Employee emp = new Employee();
        emp.setId(Integer.parseInt(req.getParameter("id")));
        emp.setName(req.getParameter("name"));
        emp.setDepartment(req.getParameter("department"));
        emp.setSalary(Double.parseDouble(req.getParameter("salary")));

        EmployeeService service = new EmployeeServiceImpl();
        service.updateEmployee(emp);

        resp.sendRedirect("listEmployees");
    }
}

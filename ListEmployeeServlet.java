package controller;

import java.io.IOException;
import java.util.List;

import entity.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.EmployeeService;
import service.EmployeeServiceImpl;
@WebServlet("/listEmployees")
public class ListEmployeeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        EmployeeService service = new EmployeeServiceImpl();
        List<Employee> list = service.getAllEmployees();

        req.getSession().setAttribute("employees", list);
        resp.sendRedirect("listEmployees.html");
    }
}

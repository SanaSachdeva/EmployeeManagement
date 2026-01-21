package controller;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.EmployeeService;
import service.EmployeeServiceImpl;
@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        EmployeeService service = new EmployeeServiceImpl();
        service.deleteEmployee(id);

        resp.sendRedirect("listEmployees");
    }
}

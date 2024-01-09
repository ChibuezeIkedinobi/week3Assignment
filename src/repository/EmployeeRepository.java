package repository;

import entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();        // Return a list of all employees.
    Employee getEmployeeById(int id);         //Return an employee by ID.
    List<Employee> getEmployeesWithSalaryAbove(double salary);     //Return a list of employees with a salary above a given threshold.

}

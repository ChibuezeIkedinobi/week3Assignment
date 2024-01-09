import entity.Employee;
import service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ikedi", 32, 500000.00);
        Employee employee2 = new Employee(2, "Chioma", 27, 600000.00);
        Employee employee3 = new Employee(3, "Eziokwu", 30, 700000.00);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

        EmployeeServiceImpl  employeeService = new EmployeeServiceImpl(employees);

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println(allEmployees);
        System.out.println();

        Employee employeeById = employeeService.getEmployeeById(2);
        System.out.println("ID 2: " + employeeById);
        System.out.println();

        List<Employee> highSalaryEmployees = employeeService.getEmployeesWithSalaryAbove(60000.00);
        System.out.println("Employees with Salary above 60000: " + highSalaryEmployees);
    }
}

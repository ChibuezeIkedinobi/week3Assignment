package service;

import entity.Employee;
import org.junit.Test;
import predicate.SalaryPredicate;
import repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeRepository {


    private final List<Employee> employees;

    public EmployeeServiceImpl(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> result = employees
                .stream()
                .filter(e -> e.getId() == id)
                .findFirst();
        return result.orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @Override
    public List<Employee> getEmployeesWithSalaryAbove(double salary) {
        SalaryPredicate salaryPredicate = e -> e.getSalary().doubleValue()  > salary;
        return employees.stream().filter(employee -> salaryPredicate.test(employee)).toList();
    }

}
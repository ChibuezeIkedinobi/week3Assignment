import entity.Employee;
import org.junit.Test;
import service.EmployeeServiceImpl;


import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

     @Test
        public void testGetEmployeesWithValidData() {

             Employee employee1 = new Employee<>(1,"Ikedi",27,850000.00);
             Employee employee2 = new Employee<>(2,"Ngozi",29,550000.00);


             List<Employee> employees = List.of(employee1, employee2);
             EmployeeServiceImpl employeeService = new EmployeeServiceImpl(employees);


             List<Employee> result = employeeService.getAllEmployees();

             assertEquals(employee1, result.get(0));
             assertEquals(employee2, result.get(1));



     }


     @Test
     public void getEmployeesWithSalaryAbove() {
          Employee employee4 = new Employee<>(1,"Ikedi",32,500000.00);
          Employee employee5 = new Employee<>(2, "Chioma", 27, 650000.00);
          Employee employee6 = new Employee<>(3, "Eziokwu", 30, 750000.00);

          List<Employee> employees = Arrays.asList(employee4, employee5, employee6);


          EmployeeServiceImpl employeeService = new EmployeeServiceImpl(employees);


          List<Employee> result = employeeService.getEmployeesWithSalaryAbove(550000);
          assertEquals(2, result.size());
          assertTrue(result.contains(employee6));
     }

}

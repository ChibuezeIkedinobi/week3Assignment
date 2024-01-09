# Employee Management System

This project implements a simple Employee Management System with Java, using classes, interfaces, and functional programming concepts.

### 1. Employee Class

- Represents an employee with attributes like id, name, age, and salary.
- Provides constructors, getters, and setters for the attributes.

### 2. EmployeeRepository Interface

- Defines methods for managing employees.
- Includes methods to get all employees, get an employee by ID, and filter employees based on salary.
- Introduces a default method to print employee details.

### 3. SalaryPredicate Functional Interface

- A functional interface with a single abstract method to test if an employee's salary meets a certain condition.

### 4. EmployeeService Class

- Implements the `EmployeeRepository` interface.
- Handles exceptions and utilizes Optional to handle null cases.

## Testing

- JUnit tests are provided in the `EmployeeServiceTest` class to ensure the functionality of the `EmployeeService` methods.
- Various scenarios, including edge cases and exception handling, are covered.


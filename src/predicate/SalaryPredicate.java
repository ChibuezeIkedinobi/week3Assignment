package predicate;

import entity.Employee;

@FunctionalInterface
public interface SalaryPredicate {
         boolean test(Employee employee);
}

package pro.sky.java.course2.collectionandsets.service;

import pro.sky.java.course2.collectionandsets.book.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee passEmployee (String firstName, String lastName);
    Employee addEmployee (String firstName, String lastName);
    Employee deleteEmployee (String firstName, String lastName);

    Collection<Employee> finedAll();
}

package pro.sky.java.course2.collectionandsets.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.collectionandsets.book.Employee;
import pro.sky.java.course2.collectionandsets.exception.EmployeeAlredyInnExceptions;
import pro.sky.java.course2.collectionandsets.exception.EmployeeNotFoudExceptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee passEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if (employeeList.contains(employee)){
            return employee;
        }
        throw new EmployeeNotFoudExceptions();
    }

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if (employeeList.contains(employee)){
            throw new EmployeeAlredyInnExceptions();
        }
        employeeList.add(employee);
        return employee;
    }


    @Override
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if (employeeList.contains(employee)){
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoudExceptions();
    }

    @Override
    public Collection<Employee> finedAll() {
        return Collections.unmodifiableList(employeeList);
    }
}

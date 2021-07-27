package com.company.girsam.repository;

import com.company.girsam.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void addNewEmployee(Employee employee);

    Employee getEmployee(int id);
}

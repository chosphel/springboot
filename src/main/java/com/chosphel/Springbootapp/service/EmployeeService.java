package com.chosphel.Springbootapp.service;

import com.chosphel.Springbootapp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee addEmployee(Employee employee);
    void updateEmployee(long id, Employee employee);
    void deleteEmployee(long id);
}

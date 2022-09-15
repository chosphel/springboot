package com.chosphel.Springbootapp.service;

import com.chosphel.Springbootapp.entity.Employee;
import com.chosphel.Springbootapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void updateEmployee(long id, Employee employee) {
        Employee savedEmployee = repository.findById(id).get();
        savedEmployee.setName(employee.getName());
        savedEmployee.setEmail(employee.getEmail());
        repository.save(savedEmployee);
    }

    @Override
    public void deleteEmployee(long id) {
        repository.deleteById(id);
    }

}


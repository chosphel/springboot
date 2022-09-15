package com.chosphel.Springbootapp.controller;

import com.chosphel.Springbootapp.entity.Employee;
import com.chosphel.Springbootapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable("id")Long id, @RequestBody Employee employee){
        service.updateEmployee(id, employee);
        return  "record updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        service.deleteEmployee(id);
        return "record deleted successfully";
    }

}


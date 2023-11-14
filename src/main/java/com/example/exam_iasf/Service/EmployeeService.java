package com.example.exam_iasf.Service;

import com.example.exam_iasf.Entities.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);

    List<Employee> findAllEmployees();
}

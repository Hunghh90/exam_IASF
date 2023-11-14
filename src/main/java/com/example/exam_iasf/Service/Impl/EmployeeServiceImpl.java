package com.example.exam_iasf.Service.Impl;

import com.example.exam_iasf.Entities.Employee;
import com.example.exam_iasf.Repository.EmployeeRepository;
import com.example.exam_iasf.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        try{
            employeeRepository.save(employee);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Employee> findAllEmployees() {

        return employeeRepository.findAll();
    }
}

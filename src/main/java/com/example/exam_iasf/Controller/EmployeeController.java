package com.example.exam_iasf.Controller;

import com.example.exam_iasf.Entities.Employee;
import com.example.exam_iasf.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/getFormCreate")
    public String getFormCreate(ModelMap modelMap) {

        try {
            Employee employee = new Employee();
            modelMap.addAttribute("employee", employee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "createEmployee";
    }

    @GetMapping("/list")
    public String showAll(ModelMap modelMap) {
        try {
            List<Employee> employees = service.findAllEmployees();
            modelMap.addAttribute("employees", employees);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "employees";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("employee") Employee employee) {
        try {
            service.createEmployee(employee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "redirect:/employees/list";
    }
}
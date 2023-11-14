package com.example.exam_iasf.Repository;

import com.example.exam_iasf.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

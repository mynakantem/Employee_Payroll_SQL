package com.example.payroll.service;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {
    Employee addEmployee(EmployeeDTO dto);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int id);
    Employee updateEmployee(int id, EmployeeDTO dto);
    void deleteEmployee(int id);
}

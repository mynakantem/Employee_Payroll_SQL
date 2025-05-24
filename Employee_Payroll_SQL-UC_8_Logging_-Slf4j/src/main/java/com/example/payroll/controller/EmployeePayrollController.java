package com.example.payroll.controller;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.service.IEmployeePayrollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeDTO dto) {
        log.info("Creating employee with data: {}", dto);
        return service.addEmployee(dto);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        log.info("Fetching all employees");
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        log.info("Fetching employee with ID: {}", id);
        return service.getEmployeeById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO dto) {
        log.info("Updating employee with ID: {} with data: {}", id, dto);
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        log.warn("Deleting employee with ID: {}", id);
        service.deleteEmployee(id);
        return "Deleted Employee with id: " + id;
    }
}

package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import com.example.employeeapp.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable int id) {
        return employeePayrollService.getEmployeePayrollDataById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollDTO empDTO) {
        return employeePayrollService.createEmployeePayrollData(empDTO);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable int id,
                                              @Valid @RequestBody EmployeePayrollDTO empDTO) {
        return employeePayrollService.updateEmployeePayrollData(id, empDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeePayrollService.deleteEmployeePayrollData(id);
        return "Deleted Employee with id: " + id;
    }
}


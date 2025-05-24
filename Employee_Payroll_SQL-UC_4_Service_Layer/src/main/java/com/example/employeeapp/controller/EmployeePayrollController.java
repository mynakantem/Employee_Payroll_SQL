package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import com.example.employeeapp.service.IEmployeePayrollService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService payrollService;

    @GetMapping("/get")
    public EmployeePayrollData getEmployeePayrollData() {
        return payrollService.getEmployeeData();
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO empDTO) {
        return payrollService.createEmployee(empDTO);
    }
}

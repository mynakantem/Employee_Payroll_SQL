package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET: Dummy data
    @GetMapping("/get")
    public EmployeePayrollData getEmployeePayrollData() {
        return new EmployeePayrollData(1, "Mark", 30000);
    }

    // POST: Receive DTO and return model object
    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO empDTO) {
        return new EmployeePayrollData(1, empDTO.name, empDTO.salary);
    }
}

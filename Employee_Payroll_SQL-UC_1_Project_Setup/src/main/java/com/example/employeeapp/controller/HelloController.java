package com.example.employeeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepayrollservice")
public class HelloController {

    @GetMapping("/")
    public String helloPayroll() {
        return "Welcome to Employee Payroll App!";
    }
}

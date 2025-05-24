package com.example.employeeapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

	    @GetMapping("/")
	    public String getAllEmployees() {
	        return "Get Call Success";
	    }

	    @GetMapping("/get/{id}")
	    public String getEmployeeById(@PathVariable int id) {
	        return "Get Call Success for id: " + id;
	    }

	    @PostMapping("/create")
	    public String createEmployee(@RequestBody String emp) {
	        return "Created Employee Payroll Data: " + emp;
	    }

	    @PutMapping("/update")
	    public String updateEmployee(@RequestBody String emp) {
	        return "Updated Employee Payroll Data: " + emp;
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable int id) {
	        return "Deleted Employee Payroll Data for id: " + id;
	    }
	}

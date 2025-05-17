package com.example.employeeapp.service;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    EmployeePayrollData getEmployeeData();
    EmployeePayrollData createEmployee(EmployeePayrollDTO empDTO);
}

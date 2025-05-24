package com.example.employeeapp.service;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDTO);
    void deleteEmployeePayrollData(int empId);
}
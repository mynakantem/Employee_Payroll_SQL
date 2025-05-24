package com.example.employeeapp.service;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public EmployeePayrollData getEmployeeData() {
        return new EmployeePayrollData(1, "Mark", 30000);
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO empDTO) {
        return new EmployeePayrollData(1, empDTO.name, empDTO.salary);
    }
}

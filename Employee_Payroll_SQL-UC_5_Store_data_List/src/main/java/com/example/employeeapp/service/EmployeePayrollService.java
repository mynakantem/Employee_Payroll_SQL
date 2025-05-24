package com.example.employeeapp.service;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private final List<EmployeePayrollData> employeeList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDTO) {
        int newId = employeeList.size() + 1;
        EmployeePayrollData newEmp = new EmployeePayrollData(newId, empDTO);
        employeeList.add(newEmp);
        return newEmp;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDTO) {
        EmployeePayrollData existingEmp = this.getEmployeePayrollDataById(empId);
        if (existingEmp != null) {
            existingEmp.setName(empDTO.getName());
            existingEmp.setSalary(empDTO.getSalary());
        }
        return existingEmp;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeList.removeIf(emp -> emp.getId() == empId);
    }
}
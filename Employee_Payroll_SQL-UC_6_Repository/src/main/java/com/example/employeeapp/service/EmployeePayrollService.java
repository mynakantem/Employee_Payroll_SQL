package com.example.employeeapp.service;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import com.example.employeeapp.model.EmployeePayrollData;
import com.example.employeeapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return repository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return repository.findById(empId).orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empDTO);
        return repository.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        if (empData != null) {
            empData.updateFromDTO(empDTO);
            return repository.save(empData);
        }
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        repository.deleteById(empId);
    }
}
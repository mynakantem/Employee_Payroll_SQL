package com.example.payroll.service;

import com.example.payroll.dto.EmployeeDTO;
import com.example.payroll.model.Employee;
import com.example.payroll.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee addEmployee(EmployeeDTO dto) {
        log.info("Adding new employee: {}", dto);
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());
        return repository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return repository.findById(id);
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO dto) {
        Optional<Employee> existing = repository.findById(id);
        if (existing.isPresent()) {
            Employee emp = existing.get();
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
            return repository.save(emp);
        } else {
            throw new RuntimeException("Employee not found");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}

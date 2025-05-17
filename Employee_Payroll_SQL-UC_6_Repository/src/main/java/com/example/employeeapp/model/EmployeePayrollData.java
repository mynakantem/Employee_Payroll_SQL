package com.example.employeeapp.model;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_payroll")
@Data
@NoArgsConstructor
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private long salary;

    public EmployeePayrollData(EmployeePayrollDTO dto) {
        this.name = dto.getName();
        this.salary = dto.getSalary();
    }

    public void updateFromDTO(EmployeePayrollDTO dto) {
        this.name = dto.getName();
        this.salary = dto.getSalary();
    }
}

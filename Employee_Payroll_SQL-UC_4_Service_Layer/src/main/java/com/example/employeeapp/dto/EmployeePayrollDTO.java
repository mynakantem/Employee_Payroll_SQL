package com.example.employeeapp.dto;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO() {}

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
    }
}

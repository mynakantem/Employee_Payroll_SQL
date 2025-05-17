package com.example.employeeapp.model;

public class EmployeePayrollData {
    private int id;
    private String name;
    private long salary;

    public EmployeePayrollData(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public long getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(long salary) { this.salary = salary; }
}

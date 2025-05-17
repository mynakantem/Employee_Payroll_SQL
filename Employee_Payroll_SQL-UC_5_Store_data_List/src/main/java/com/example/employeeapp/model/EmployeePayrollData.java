package com.example.employeeapp.model;

import com.example.employeeapp.dto.EmployeePayrollDTO;
import lombok.Data;

@Data
public class EmployeePayrollData {
    private int id;
    private String name;
    private long salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(int id, EmployeePayrollDTO dto) {
        this.id = id;
        this.name = dto.getName();
        this.salary = dto.getSalary();
    }

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(long salary2) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}

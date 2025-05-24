package com.example.employeeapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeePayrollDTO {
    @NotNull(message = "Employee name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name is Invalid")
    private String name;

    @Min(value = 500, message = "Salary should be more than 500")
    private long salary;

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}

package com.spring.services;

import java.util.List;

import com.spring.model.Employee;

public interface EmpServices {
	public void addEmployee(Employee emp);
	public  Employee fetchEmployeeById(int empId);
	public void deleteEmployeeById(int empId);
	public void updateEmployeEmailById(int empid,String email);
	public List<Employee> getEmpTotInfo();
}

package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmpDao {
	public void createEmployee(Employee emp);
	public  Employee getEmployeeById(int empId);
	public void deleteEmployeeById(int empId);
	public void updateEmployeEmailById(int empid,String email);
	public List<Employee> getEmpInfo();
}

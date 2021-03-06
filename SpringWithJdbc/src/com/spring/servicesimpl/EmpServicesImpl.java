package com.spring.servicesimpl;

import java.util.List;

import com.spring.dao.EmpDao;
import com.spring.model.Employee;
import com.spring.services.EmpServices;

public class EmpServicesImpl implements EmpServices {
	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void addEmployee(Employee emp) {
		empDao.createEmployee(emp);

	}

	@Override
	public Employee fetchEmployeeById(int empId) {
		return empDao.getEmployeeById(empId);
	}

	@Override
	public void deleteEmployeeById(int empId) {
		empDao.deleteEmployeeById(empId);
	}

	@Override
	public void updateEmployeEmailById(int empid, String email) {
		empDao.updateEmployeEmailById(empid, email);
	}

	@Override
	public List<Employee> getEmpTotInfo() {
		return empDao.getEmpInfo();
	}

}

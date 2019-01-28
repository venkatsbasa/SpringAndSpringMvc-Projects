package com.spring.daoimp;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.dao.EmpDao;
import com.spring.model.Employee;

public class EmpDaoImpl implements EmpDao {
    private HibernateTemplate hibernateTemplate;
    
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void createEmployee(Employee emp) {
		hibernateTemplate.save(emp);
		
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeEmailById(int empid, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

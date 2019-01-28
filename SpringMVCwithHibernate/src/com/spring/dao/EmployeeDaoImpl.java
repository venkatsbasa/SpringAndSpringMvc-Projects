package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Employee;
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
     @Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployeess() {
		 return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM VENKATS.EMPLOYEE_TABLE WHERE emp_id = "+employee.getEmpId()).executeUpdate();

	}

	

}

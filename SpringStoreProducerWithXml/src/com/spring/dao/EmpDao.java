package com.spring.dao;

import com.spring.model.Employee;

public interface EmpDao {
	public Employee fetchEmpDetailsById(int EmpId);
}

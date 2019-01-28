package com.spring.seviceimpl;

import com.spring.dao.EmpDao;
import com.spring.model.Employee;
import com.spring.sevice.EmpService;

public class EmpServiceImpl implements EmpService{
	
	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public Employee fetchEmpDetailsById(int EmpId) {
		return empDao.fetchEmpDetailsById(EmpId);
	}

}

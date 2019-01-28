package com.spring.daoimpl;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.spring.dao.EmpDao;
import com.spring.model.Employee;

public class EmpDaoImpl implements EmpDao{
	private SimpleJdbcCall simpleJdbcCall;
	public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
		this.simpleJdbcCall = simpleJdbcCall;
	}
	public Employee fetchEmpDetailsById(int EmpId) {
		
		 simpleJdbcCall.withProcedureName("PROC_NAME");
		 MapSqlParameterSource map=new  MapSqlParameterSource();
		 map.addValue("ID1", EmpId);
		 Map<String,Object> mymap=simpleJdbcCall.execute(map);
		 Employee emp=new Employee(); 
		emp.setEmpName(mymap.get("EMP_NAME").toString());
		 return emp;
	}

}

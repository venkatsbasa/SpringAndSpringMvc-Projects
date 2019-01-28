package com.spring.daoimp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setEmpId(rs.getInt("emp_id"));
		emp.setEmpName(rs.getString("emp_name"));
		emp.setGender(rs.getString("emp_gender"));
		emp.setEmail(rs.getString("emp_email"));
		//System.out.println("row mapper called=="+rowNum);
		return emp;
	}

	

}

package com.spring.daoimp;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.EmpDao;
import com.spring.model.Employee;

public class EmpDaoImpl implements EmpDao {

	// private DataSource datasource;
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/*
	 * public void setDatasource(DataSource datasource) { this.datasource =
	 * datasource; this.jdbcTemplate=new JdbcTemplate(datasource); }
	 */
	@Override
	public void createEmployee(Employee emp) {
		String Sql = "insert into venkats.EMPLOYEE_TABLE(emp_name,emp_gender,emp_email) values(?,?,?)";
		int update = jdbcTemplate.update(Sql, new Object[] { emp.getEmpName(), emp.getGender(), emp.getEmail() });
		if (update > 0) {
			System.out.println("data inserted into the table ==" + emp.getEmpName());
		}
	}

	@Override
	public Employee getEmployeeById(int empId) {
		String Sql = "select * from venkats.EMPLOYEE_TABLE where emp_id=?";
		return jdbcTemplate.queryForObject(Sql, new EmpRowMapper(), empId);
	}

	@Override
	public void deleteEmployeeById(int empId) {
		String Sql = "delete from venkats.EMPLOYEE_TABLE where emp_id=?";
		if (jdbcTemplate.update(Sql, empId) > 0) {
			System.out.println("emp deleteed...........");
		}
	}

	@Override
	public void updateEmployeEmailById(int empid, String email) {
		String Sql = "update venkats.EMPLOYEE_TABLE set emp_email=? where emp_id=?";
		if (jdbcTemplate.update(Sql, email, empid) > 0) {
			System.out.println("emp mail id is update to====" + email + " emp id ===" + empid);
		}

	}

	@Override
	public List<Employee> getEmpInfo() {
		String Sql = "select * from venkats.EMPLOYEE_TABLE";
		// List<Employee> empList= jdbcTemplate.query(Sql, new EmpRowMapper());
		return jdbcTemplate.query(Sql, new EmpRowMapper());
	}

	/*
	 * @Override public void createEmployee(Employee emp) { Connection con = null;
	 * PreparedStatement ps = null; try { con = datasource.getConnection(); String
	 * sql =
	 * "insert into venkats.EMPLOYEE_TABLE(emp_name,emp_gender,emp_email) values(?,?,?)"
	 * ; ps = con.prepareStatement(sql); ps.setString(1, emp.getEmpName());
	 * ps.setString(2, emp.getGender()); ps.setString(3, emp.getEmail()); int update
	 * = ps.executeUpdate(); if (update > 0) {
	 * System.out.println("emp data inserted in db==="+emp.getEmpName()); } } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */
}

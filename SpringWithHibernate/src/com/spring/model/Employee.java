package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String gender;

	public int getEmpId() {
		return empId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	@Column(name = "emp_name")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	@Column(name = "emp_email")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	@Column(name = "emp_gender")
	public void setGender(String gender) {
		this.gender = gender;
	}
}

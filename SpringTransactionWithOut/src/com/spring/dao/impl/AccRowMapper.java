package com.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Account;

public class AccRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account acc=new Account();
		acc.setAccountNumber(rs.getInt("account_no"));
		acc.setAccountBal(rs.getInt("account_bal"));
		acc.setAccountName(rs.getString("account_name"));
		acc.setAccountType(rs.getString("account_type"));
		
		return acc;
	}

	

}

package com.spring.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.BankDao;
import com.spring.model.Account;

public class BankDaoImpl implements BankDao {
private JdbcTemplate jdbcTemplate;

	@Override
	public void withDraw(Account account , int amount) {
		
		Account accfrom=getAccountFromDb(account.getAccountNumber());
		int bal=accfrom.getAccountBal()-amount;
		String sql="update   venkats.basa_bank SET ACCOUNT_BAL=? where ACCOUNT_NO=?";
		int update=getJdbcTemplate().update(sql,bal,accfrom.getAccountNumber());
		Account accn=getAccountFromDb(account.getAccountNumber());
		if(update>0) {
			System.out.println("account number=="+accn.getAccountNumber()+" with drawn amount is=="+amount+" present account bal=="+accn.getAccountBal());
		}
		
	}

	

	@Override
	public void depositeWithAccToAcc(Account fromAcc, Account toAcc, int amount) {
		Account accfrom=getAccountFromDb(fromAcc.getAccountNumber());	
		Account toacc=getAccountFromDb(toAcc.getAccountNumber());	
		int balfrm=accfrom.getAccountBal()-amount;
		String sqlfrom="update   venkats.basa_bank SET ACCOUNT_BAL=? where ACCOUNT_NO=?";
		int update=getJdbcTemplate().update(sqlfrom,balfrm,accfrom.getAccountNumber());
		Account accn=getAccountFromDb(accfrom.getAccountNumber());
		if(update>0) {
			System.out.println("account number=="+accn.getAccountNumber()+" transfer amount is=="+amount+" present account bal=="+accn.getAccountBal());
		}
		int tobal=toacc.getAccountBal()+amount;
		String tosql="update   venkats.basa_bank SET ACCOUNT_BAL=? where ACCOUNT_NO=?";
		int updateto=getJdbcTemplate().update(tosql,tobal,toacc.getAccountNumber());
		Account accn1=getAccountFromDb(toacc.getAccountNumber());
		if(updateto>0) {
			System.out.println("account number=="+accn1.getAccountNumber()+" deposite amount is=="+amount+" present account bal=="+accn1.getAccountBal());
		}
		throw new RuntimeException("transaction is rolled back....!");
	}
	@Override
	public void deposite(Account account, int amount) {
		Account accfrom=getAccountFromDb(account.getAccountNumber());
		int bal=accfrom.getAccountBal()+amount;
		String sql="update   venkats.basa_bank SET ACCOUNT_BAL=? where ACCOUNT_NO=?";
		int update=getJdbcTemplate().update(sql,bal,accfrom.getAccountNumber());
		Account accn=getAccountFromDb(account.getAccountNumber());
		if(update>0) {
			System.out.println("account number=="+accn.getAccountNumber()+" with drawn amount deposite amount is=="+amount+" present account bal=="+accn.getAccountBal());
		}
		
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	private Account getAccountFromDb(int accountNumber) {
		String sql="select * from venkats.basa_bank where account_no=?";
		return getJdbcTemplate().queryForObject(sql, new AccRowMapper(),accountNumber);
		
		
	}
	
}

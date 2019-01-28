package com.spring.aop.impl;

import com.spring.aop.Account;

public class AccountServiceImpl {
 
	public Account updateAccountBal(Account accout,Long amount) {
		System.out.println("account is updated.....!   for "+accout.getAccountNumber()+"is bal=="+amount);
		return accout;
	}
	
	
}

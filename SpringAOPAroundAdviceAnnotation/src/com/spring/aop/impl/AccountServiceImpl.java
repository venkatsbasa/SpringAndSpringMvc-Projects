package com.spring.aop.impl;

import org.springframework.stereotype.Service;

import com.spring.aop.Account;
@Service("accountServiceImpl")
public class AccountServiceImpl {
 
	public Account updateAccountBal(Account accout,Long amount) {
		System.out.println("account is updated.....!   for "+accout.getAccountNumber()+"is bal=="+amount);
		return accout;
	}
	
	
}

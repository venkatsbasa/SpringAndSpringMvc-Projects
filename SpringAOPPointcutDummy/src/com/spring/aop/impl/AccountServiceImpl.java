package com.spring.aop.impl;

import org.springframework.stereotype.Service;

import com.spring.aop.Account;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
 
	/* (non-Javadoc)
	 * @see com.spring.aop.impl.AccountService#updateAccountBal(com.spring.aop.Account, java.lang.Long)
	 */
	@Override
	public void updateAccountBal(Account accout,Long amount) {
		System.out.println("account is updated.....!   for "+accout.getAccountNumber()+"is bal=="+amount);
	}
	
	
}

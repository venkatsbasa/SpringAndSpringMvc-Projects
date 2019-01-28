package com.spring.service.impl;

import com.spring.dao.BankDao;
import com.spring.model.Account;
import com.spring.service.BankServices;

public class BankServiceImpl implements BankServices {
    private BankDao bankDao;
    
	

	public BankDao getBankDao() {
		return bankDao;
	}

	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}

	@Override
	public void withDraw(Account account, int amount) {
		getBankDao().withDraw(account,amount);
		
	}

	@Override
	public void deposite(Account acc, int amount) {
		getBankDao().deposite(acc,amount);
		
	}

	@Override
	public void depositeWithAccToAcc(Account fromAcc, Account toAcc, int amount) {
		getBankDao().depositeWithAccToAcc(fromAcc,toAcc,amount);

		
	}

}

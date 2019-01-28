package com.spring.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.dao.BankDao;
import com.spring.model.Account;
import com.spring.service.BankServices;

public class BankServiceImpl implements BankServices {
    private BankDao bankDao;
    
    private TransactionTemplate transactionTemplate;
  

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
		transactionTemplate.execute(new TransactionCallback<Void>() {

			@Override
			public Void doInTransaction(TransactionStatus status) {
				getBankDao().depositeWithAccToAcc(fromAcc,toAcc,amount);
				return null;
			}
		
		});


		
	}

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}

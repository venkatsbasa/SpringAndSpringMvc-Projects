package com.spring.aop;

public class Account {
	private String accountNumber;
	private String accountDiscprtion;

	public Account(String accountNumber, String accountDiscprtion) {
		super();
		this.accountNumber = accountNumber;
		this.accountDiscprtion = accountDiscprtion;
	}

	public String getAccountDiscprtion() {
		return accountDiscprtion;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}

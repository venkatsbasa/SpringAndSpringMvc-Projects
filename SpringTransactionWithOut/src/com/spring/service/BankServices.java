/**
 * 
 */
package com.spring.service;

import com.spring.model.Account;


 
public interface BankServices {

	public void withDraw(Account account,int amount);
	public void deposite(Account acc,int amount);
	public void depositeWithAccToAcc(Account fromAcc,Account toAcc,int amount);
}
 
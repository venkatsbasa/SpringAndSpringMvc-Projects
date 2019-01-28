/**
 * 
 */
package com.spring.dao;

import com.spring.model.Account;

/**
 * @author venkataramana.b
 *
 */
public interface BankDao {
	public void withDraw(Account account,int amount);
	public void deposite(Account acc,int amount);
	public void depositeWithAccToAcc(Account fromAcc,Account toAcc,int amount);

}

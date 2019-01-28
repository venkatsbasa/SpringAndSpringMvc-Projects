/**
 * 
 */
package com.spring.model;

/**
 * @author venkataramana.b
 *
 */
public class Account {

	private int accountNumber;
	private String accountName;
	private String accountType;
	private int accountBal;

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", accountBal=" + accountBal + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}

}

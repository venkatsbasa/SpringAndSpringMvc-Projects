package com.spring.aop.impl;

import java.util.HashMap;
import java.util.Map;

import com.spring.aop.Account;

public class AccountServiceImpl {

	private static Map<String,Account> map=null;
	static {
		map=new HashMap<String,Account>();
		map.put("C67669800", new Account("78278287000", "Saving-Account"));
		map.put("C67669811", new Account("78278287111", "Current-Account"));
	}
	
	public Account getAccountByCustomerId(String customerId) throws Exception {
		Account acc=null;
		if(customerId==null) {
   		 throw new Exception("account number not found...!");
   	 }
         for(Map.Entry<String,Account> entry:map.entrySet()) {
        	 if(entry.getKey().equals(customerId)) {
        		acc=entry.getValue(); 
        	 }
         }
		return acc;
	}

}

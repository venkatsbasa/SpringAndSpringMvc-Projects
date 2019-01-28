package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Account;
import com.spring.service.BankServices;
import com.spring.service.impl.BankServiceImpl;

public class Demo {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		BankServices bankService =ctx.getBean("bankService",BankServiceImpl.class);
		Account acc=new Account();
		acc.setAccountNumber(1234568);
		Account acc1=new Account();
		acc1.setAccountNumber(1234569);
		bankService.depositeWithAccToAcc(acc1, acc, 100);
		ctx.close();

	}

}

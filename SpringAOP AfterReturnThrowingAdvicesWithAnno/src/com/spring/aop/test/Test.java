package com.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Account;
import com.spring.aop.impl.AccountServiceImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("Beans.xml");
		
		AccountServiceImpl accountService =ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.getAccountByCustomerId("C67669800");
		((AbstractApplicationContext) ctx).close();
	}

}

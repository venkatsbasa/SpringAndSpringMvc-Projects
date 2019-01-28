package com.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Account;
import com.spring.aop.impl.AccountService;
import com.spring.aop.impl.AccountServiceImpl;

public class Test  {

	public static void main(String[] args) {
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("Beans.xml");
		
		AccountService accountService =ctx.getBean("accountService", AccountServiceImpl.class);
		accountService.updateAccountBal(new Account("123567", "venkat-account"),3000l);
		((AbstractApplicationContext) ctx).close();
	}

}

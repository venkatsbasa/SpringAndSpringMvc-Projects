package com.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Account;
import com.spring.aop.impl.AccountServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("Beans.xml");
		
		AccountServiceImpl accountService =ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.updateAccountBal(new Account("1234567", "venkataccount"),3000l);
		((AbstractApplicationContext) ctx).close();
		/*String st="venkat";
		String s="venkat";
		String st1=new String("venkat");
		System.out.println(st.hashCode()+"   "+st1.hashCode()+" "+s.hashCode());
		System.out.println(s==st);
		System.out.println(st==st1);
		System.out.println(st.hashCode()==st1.hashCode());*/
	}

}

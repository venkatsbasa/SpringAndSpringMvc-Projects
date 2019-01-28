package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.sevice.EmpService;
import com.spring.seviceimpl.EmpServiceImpl;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		EmpService empsrv=ctx.getBean("empServiceImpl",EmpServiceImpl.class);
		Employee emp=empsrv.fetchEmpDetailsById(1);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmail()+" "+emp.getGender());
		((AbstractApplicationContext) ctx).close();
		

	}

}

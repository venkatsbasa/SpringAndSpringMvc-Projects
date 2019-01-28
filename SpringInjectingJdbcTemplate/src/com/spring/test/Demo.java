package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;
import com.spring.servicesimpl.EmpServicesImpl;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("Beans.xml");
		EmpServicesImpl empserv=ctx.getBean("empServicesImpl",EmpServicesImpl.class);
		/*for(int i=1;i<11;i++) {
			Employee emp=new Employee();
			emp.setEmpName("venkat"+i);
			emp.setGender("Male"+i);
			emp.setEmail("venkat"+i+"@sappu.com");
			empserv.addEmployee(emp);
		}*/
		
		/*Employee emp=new Employee();
		emp.setEmpName("sappuvenkat");
		emp.setGender("Female");
		emp.setEmail("sappuvenkat@sappu.com");
		empserv.addEmployee(emp);*/
		/*for(int i=1;i<12;i++) {
		Employee emp=empserv.fetchEmployeeById(i);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getGender()+" "+emp.getEmail());
		}*/
		for(Employee emp:empserv.getEmpTotInfo()) {
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getGender()+" "+emp.getEmail());
		}
		System.out.println("================================");
		//empserv.updateEmployeEmailById(9, "venkat.basa@sappu.com");
		//empserv.deleteEmployeeById(5);
		System.out.println("================================");
		for(Employee emp:empserv.getEmpTotInfo()) {
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getGender()+" "+emp.getEmail());
		}
		((AbstractApplicationContext) ctx).close();

	}

}

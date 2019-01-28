package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.configuration.ApplicationConfig;
import com.spring.model.Person;
import com.spring.services.PersonServices;

public class Demo {

	public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		PersonServices personServices=  ctx.getBean(PersonServices.class);
		
		/*Person person=new Person();
		person.setFirst_name("sapthaja");
		person.setLast_name("basa");
		person.setAge(28);
		personServices.addPerson(person);*/
		
		
		Person p=personServices.find(3);
	System.out.println(p);
	
	  for(Person b:personServices.findAll()) {
		  System.out.println(b);  
	  }
		

		
		 ((AbstractApplicationContext) ctx).close();

	}

}

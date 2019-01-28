package com.spring.model;

public class Person {
	private int person_id;
	private String first_name;
	private String last_name;
	private int age;

	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int person_id, String first_name, String last_name, int age) {
		super();
		this.person_id = person_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", first_name=" + first_name + ", last_name=" + last_name + ", age="
				+ age + "]";
	}

}

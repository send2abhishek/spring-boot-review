package com.send2abhishek.spring.springbootbasics;

public class Employee {
	
	private int id;
	private String name;
	private String desc;
	
	
	public Employee(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}
	
	
	
	

}

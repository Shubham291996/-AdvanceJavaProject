package com.javabatch.advanced;

import java.io.Serializable;

public class Employee implements Serializable  {
	private String name;
	private int id;
	public Employee() {

	}
	public Employee (String name , int id) {
		this.name = name;
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}

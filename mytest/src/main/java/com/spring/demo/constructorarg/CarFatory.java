package com.spring.demo.constructorarg;

public class CarFatory {

	private String name;

	private Integer address;

	private Employee employee;

	CarFatory(String name, Integer address, Employee employee) {
		this.name = name;
		this.address = address;
		this.employee = employee;
	}

	public void Welcome() {
		System.out.println("Welcome to " + this.name + " !");
		System.out.println("Employee name: " + this.employee.getName() + ", age: " + this.employee.getAge());
	}
}

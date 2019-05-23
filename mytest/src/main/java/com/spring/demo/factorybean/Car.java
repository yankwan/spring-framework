package com.spring.demo.factorybean;

public class Car {

	private String name;

	private String type;

	Car(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void CarInfo() {
		System.out.println("Car : " + this.name + ", type : " + this.type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

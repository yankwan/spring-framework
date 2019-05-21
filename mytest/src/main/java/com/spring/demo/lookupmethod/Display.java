package com.spring.demo.lookupmethod;

public abstract class Display {

	public abstract Car getCar();

	public void display() {
		getCar().display();
	}
}

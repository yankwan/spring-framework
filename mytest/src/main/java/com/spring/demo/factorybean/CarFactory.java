package com.spring.demo.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Car("BMW", "SUV");
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	public void carFactoryInfo() {
		System.out.println("This is CarFactory instance!");
	}
}

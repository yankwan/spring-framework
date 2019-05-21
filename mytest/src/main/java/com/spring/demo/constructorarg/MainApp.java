package com.spring.demo.constructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml");
		CarFatory fatory = (CarFatory) context.getBean("carFactory");
		fatory.Welcome();
	}
}

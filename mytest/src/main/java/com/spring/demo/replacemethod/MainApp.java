package com.spring.demo.replacemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("replace-method.xml");
		MyMethod method = (MyMethod) context.getBean("myMethod");
		method.display();
	}
}

package com.spring.demo.customerxsd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("custo-user.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getUserName() + "----" + user.getEmail());
	}
}

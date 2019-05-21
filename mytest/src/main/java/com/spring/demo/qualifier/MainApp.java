package com.spring.demo.qualifier;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("qualifier.xml");
		TestBean testBean = (TestBean) applicationContext.getBean("testBean");
		testBean.getDataSource().connection();
	}
}

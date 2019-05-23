package com.spring.demo.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car-bean.xml");
		// 调用工厂bean: CarFactory 生成Car实例对象
		Car car = (Car) context.getBean("carFactory");
		car.CarInfo();

		// 通过&carFactory获取工厂bean
		CarFactory factory = (CarFactory) context.getBean("&carFactory");
		factory.carFactoryInfo();
	}
}

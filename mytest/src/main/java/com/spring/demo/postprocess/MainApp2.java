package com.spring.demo.postprocess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	public static void main(String[] args) {

		// 使用ApplicationContext 可以自动注册BeanPostProcessor
		// 但必须把实现类设置为prototype类型
		// <bean id = "testBeanPostProcessor" scope="prototype" class = "com.spring.demo.postprocess.TestBeanPostProcessor" />

		// 实际上BeanPostProcessor类一般不通过主动调用，只作为注册后被动被Spring框架调用
		// 如作为日志记录等辅助操作，见例子MainApp3

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("postprocess-bean.xml");
		// 一般不会主动通过getBean去获取BeanPostProcessor实例
		TestBeanPostProcessor tb = (TestBeanPostProcessor) applicationContext.getBean("testBeanPostProcessor");
		tb.echo();
	}
}

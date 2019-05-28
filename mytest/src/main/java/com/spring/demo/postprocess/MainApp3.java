package com.spring.demo.postprocess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
	public static void main(String[] args) {
		// ApplicationContext 自动完成BeanPostProcessor的注册
		// 会获取Spring容器中所有的BeanPostProcessor
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("postprocess-bean.xml");
		DemoService service = (DemoService) applicationContext.getBean("demoService");
		service.sayHello();
	}
}

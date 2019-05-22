package com.spring.demo.helloworld;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

//		ClassPathResource resource = new ClassPathResource("beans.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		// BeanDefinitionReader 读取并解析Resource资源
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		// 将资源封装成BeanDefinition
//		reader.loadBeanDefinitions(resource);
	}
}

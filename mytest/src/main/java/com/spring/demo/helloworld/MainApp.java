package com.spring.demo.helloworld;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.context.support.UiApplicationContextUtils;

public class MainApp {
	public static void main(String[] args) {
		// 1. 根据xml创建资源对象
		ClassPathResource resource = new ClassPathResource("beans.xml");
		// 2. 创建IoC容器
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 3. 创建BeanDefinitionReader 读取并解析Resource资源, factory作为构造函数入参
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// 4. 将资源封装成BeanDefinition并载入BeanDefinition
		reader.loadBeanDefinitions(resource);

		// 获取bean names
		for(String beanName : factory.getBeanDefinitionNames()) {
			System.out.println("bean name : " + beanName);
		}

		// 获取bean并执行bean的方法
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		helloWorld.getMessage();
	}
}

package com.spring.demo.aware;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {

//		ClassPathResource resource = new ClassPathResource("aware-bean.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(resource);
//
//		// A 只触发BeanNameAware, BeanFactoryAware, BeanClassLoaderAware三个Aware
//		TestApplicationAware testApplicationAware = (TestApplicationAware) factory.getBean("testApplicationAware");
//		testApplicationAware.echoInfo();

		// B 同时也触发ApplicationContextAware
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware-bean.xml");
		TestApplicationAware testApplicationAware = (TestApplicationAware) applicationContext.getBean("testApplicationAware");
		testApplicationAware.echoInfo();

	}
}

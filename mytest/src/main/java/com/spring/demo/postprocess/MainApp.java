package com.spring.demo.postprocess;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("postprocess-bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		TestBeanPostProcessor tb = (TestBeanPostProcessor) factory.getBean("testBeanPostProcessor");
		tb.echo();
	}
}

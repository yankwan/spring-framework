package com.spring.demo.postprocess;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("postprocess-bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		// Spring框架中的注册方式 简单实现
		// 该方法因为已调用了factory.getBean()执行过bean实例初始化，默认是单例模式会缓存在缓存中
		// 再次getBean直接从缓存中获取
		// 因此通过该方法注册不能调用前后置的方法
		String[] postProcessorNames = factory.getBeanNamesForType(BeanPostProcessor.class, true, false);
		for (String postProcessorName : postProcessorNames) {
			BeanPostProcessor pp = factory.getBean(postProcessorName, BeanPostProcessor.class);
			factory.addBeanPostProcessor(pp);
		}

		// 手动将beanPostProcessor注册到beanPostProcessors List中
		// 直接添加 可以调用到前后置方法
		factory.addBeanPostProcessor(new TestBeanPostProcessor());

		TestBeanPostProcessor tb = (TestBeanPostProcessor) factory.getBean("testBeanPostProcessor");
		tb.echo();
	}
}

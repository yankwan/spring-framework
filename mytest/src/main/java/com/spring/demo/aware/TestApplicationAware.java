package com.spring.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestApplicationAware implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, ApplicationContextAware {

	private String beanName;

	private BeanFactory beanFactory;

	private ClassLoader classLoader;

	private ApplicationContext applicationContext;

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("... invoke TestApplicationAware#setBeanClassLoader ...");
		this.classLoader = classLoader;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("... invoke TestApplicationAware#setBeanFactory ...");
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("... invoke TestApplicationAware#setBeanName ...");
		this.beanName = beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("... invoke TestApplicationAware#applicationContext ...");
		this.applicationContext = applicationContext;
	}

	public void echoInfo() {
		System.out.println("beanName: " + beanName);
		System.out.println("isSingleton: " + beanFactory.isSingleton(beanName));
		System.out.println("sysEnv: " + applicationContext.getEnvironment());
	}
}

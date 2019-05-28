package com.spring.demo.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class TestBeanPostProcessor implements BeanPostProcessor {

	// BeanPostProcessor 实现了default 接口方法，这里重写default接口方法

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "开始初始化！");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "完成初始化！");
		return bean;
	}

	public void echo() {
		System.out.println("This is TestBeanPostProcessor!");
	}
}

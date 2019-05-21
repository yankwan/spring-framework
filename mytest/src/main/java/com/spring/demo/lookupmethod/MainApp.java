package com.spring.demo.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Change the lookup-method.xml content `<lookup-method name="getCar" bean="BMW"/>` bean to different bean name
 *
 * Spring 动态改变 bean 的方法实现。方法执行返回的对象，使用 Spring 内原有的这类对象替换，通过改变方法返回值来动态改变方法。
 * 内部实现为使用 cglib 方法，重新生成子类，重写配置的方法和返回对象，达到动态改变的效果。
 *
 * The lookup method source code can debug in `BeanMetadataAttributeAccessor#parseLookupOverrideSubElements(...)`
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lookup-method.xml");
		Display display = (Display) context.getBean("display");
		display.display();
	}
}

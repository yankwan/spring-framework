package com.spring.demo.replacemethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Spring 动态改变 bean 里方法的实现。
 * 需要改变的方法使用 Spring 内原有其他类（需继承接口org.springframework.beans.factory.support.MethodReplacer）的逻辑替换这个方法。
 * 通过改变方法执行逻辑来动态改变方法。
 *
 * The replace method source code can debug in `BeanMetadataAttributeAccessor#parseReplacedMethodSubElements(...)`
 */
public class ReplaceMethod implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Replace Method!");
		return null;
	}
}

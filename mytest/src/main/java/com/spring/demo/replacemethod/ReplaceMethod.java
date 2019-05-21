package com.spring.demo.replacemethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * The replace method source code can debug in `BeanMetadataAttributeAccessor#parseReplacedMethodSubElements(...)`
 */
public class ReplaceMethod implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Replace Method!");
		return null;
	}
}

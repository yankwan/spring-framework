package com.spring.demo.postprocess;

public class DemoServiceImpl implements DemoService, NameInject {

	private String name;

	@Override
	public void sayHello() {
		System.out.println("hello " + name);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}

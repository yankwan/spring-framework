package com.spring.demo.qualifier;

import org.springframework.stereotype.Component;

@Component
public class OracleDataSource implements DataSource {
	@Override
	public void connection() {
		System.out.println("Oracle DataSource!");
	}
}

package com.spring.demo.qualifier;

import org.springframework.stereotype.Component;

@Component
public class MysqlDataSource implements DataSource {
	@Override
	public void connection() {
		System.out.println("Mysql Datasource!");
	}
}

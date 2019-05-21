package com.spring.demo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {

	// 通过@Qualifier指定具体的DataSource数据源
	@Autowired
	@Qualifier(value = "mysqlDataSource")
	private DataSource dataSource;

	public DataSource getDataSource() {
		return this.dataSource;
	}
}

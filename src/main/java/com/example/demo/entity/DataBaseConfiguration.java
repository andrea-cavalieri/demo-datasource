package com.example.demo.entity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBaseConfiguration {

	@Autowired
	private Environment env;

	// @Bean
	// @ConfigurationProperties(prefix = "spring.datasource")
	// public DataSource vgiDataSource() {

	// 	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	// 	dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
	// 	dataSource.setUrl(env.getProperty("spring.datasource.url"));
	// 	dataSource.setUsername(env.getProperty("spring.datasource.username"));
	// 	dataSource.setPassword(env.getProperty("spring.datasource.password"));
	// 	return dataSource;
	// }
}
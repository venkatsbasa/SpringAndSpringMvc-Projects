package com.spring.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring")
@PropertySource(value= {"classpath:db.properties"})
public class ApplicationConfig {
	@Autowired
	private Environment envirmt;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(envirmt.getRequiredProperty("db.driverClassName"));
        dataSource.setUrl(envirmt.getRequiredProperty("db.url"));
        dataSource.setUsername(envirmt.getRequiredProperty("db.username"));
        dataSource.setPassword(envirmt.getRequiredProperty("db.password"));
		return dataSource;
		
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		 JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
	        jdbcTemplate.setResultsMapCaseInsensitive(true);
	        return jdbcTemplate;
	}
	
}

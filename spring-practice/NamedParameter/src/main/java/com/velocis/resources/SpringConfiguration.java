package com.velocis.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dmds= new DriverManagerDataSource();
		
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/pranjul");
		dmds.setUsername("root");
		dmds.setPassword("Pranjul@12345");
		
		return dmds;
		
	}
   
	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate() {
			
		NamedParameterJdbcTemplate npjt= new NamedParameterJdbcTemplate(myDataSource());
		
		return npjt;
		
	}

}

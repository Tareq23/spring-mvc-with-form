package com.tareq23.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.tareq23.DAO.AppDAOImplements;

@Configuration
public class AppConfig {
	
	
	@Bean
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mvc_db");
		dataSource.setUsername("root");
		dataSource.setPassword("12x34y56z");
		
		return dataSource;
	}

	@Bean(name="DAOBean")
	public AppDAOImplements AppDAO()
	{
		return new AppDAOImplements(getDataSource());
	}
	
}

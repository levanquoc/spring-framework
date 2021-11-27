package edu.vinaenter.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("edu.vinaenter.*")

public class JdbcConfig {
	
	
	private final String URL = "jdbc:mysql://localhost:3306/anews";
	private final String USERNAME = "root";
	private final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private final String PASSWORD = "";

	@Bean
	public JdbcTemplate jdbcTemplate() {   //jdbctemple có sẵn các phương thức sql: update, select...
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		driverManagerDataSource.setUsername(USERNAME);
		driverManagerDataSource.setPassword(PASSWORD);
		driverManagerDataSource.setDriverClassName(DRIVERNAME);
		return driverManagerDataSource;
	}
}

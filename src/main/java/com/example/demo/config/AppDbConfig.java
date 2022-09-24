package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages="com.example.demo.repositories.app", entityManagerFactoryRef="appEMFactory")
public class AppDbConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "app.datasource")
	public DataSource appDataSource() {
		System.out.println("AppDbConfig.appDataSource");
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean appEMFactory(EntityManagerFactoryBuilder builder, @Qualifier("appDataSource") DataSource ds) {
		System.out.println("AppDbConfig.appEMFactory");
		return builder.dataSource(ds).packages("com.example.demo.model.app").build();
		 
	}
}

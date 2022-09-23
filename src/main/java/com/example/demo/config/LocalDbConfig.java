package com.example.demo.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "localEMFactory", basePackages = "com.example.demo.repositories.local")
public class LocalDbConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "local.datasource")
	public DataSource localDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localEMFactory(EntityManagerFactoryBuilder builder, @Qualifier("localDataSource")  DataSource ds) {
		return builder.dataSource(ds).packages("com.example.demo.model.local").build();
	}

}

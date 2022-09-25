package com.example.demo.config;

import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages="com.example.demo.repositories.local", 
	entityManagerFactoryRef = "localEMFactory",
	transactionManagerRef = "allTransationManager")
public class LocalDbConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "local.datasource")
	public DataSource localDataSource() {
		System.out.println("LocalDbConfig.localDataSource");
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localEMFactory(EntityManagerFactoryBuilder builder, @Qualifier("localDataSource") DataSource ds) {
		System.out.println("LocalDbConfig.localEMFactory");
		return builder.dataSource(ds).packages("com.example.demo.model.local").build();
	}

	@Bean
	public PlatformTransactionManager allTransationManager(@Qualifier("localEMFactory") LocalContainerEntityManagerFactoryBean allEMTransaction) {
		return new JpaTransactionManager(Objects.requireNonNull(allEMTransaction).getObject());
	}
}

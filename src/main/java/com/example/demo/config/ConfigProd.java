package com.example.demo.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "prod")
public class ConfigProd implements Config{

	public ConfigProd() {
		System.out.println("Config de producao");
	}
}

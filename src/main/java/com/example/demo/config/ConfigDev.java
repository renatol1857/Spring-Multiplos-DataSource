package com.example.demo.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "dev")
public class ConfigDev implements Config{

	public ConfigDev() {
		System.out.println("Config de Desenvolvimento");
		}
}

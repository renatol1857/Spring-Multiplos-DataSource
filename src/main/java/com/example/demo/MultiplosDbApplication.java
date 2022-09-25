package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.local.Usuario;
import com.example.demo.services.UsuarioService;

@SpringBootApplication
public class MultiplosDbApplication implements CommandLineRunner {
	
	@Autowired
	UsuarioService usuarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(MultiplosDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario("Renato", "renato@gmail.com", "12345");
		
		
		usuarioService.criar(usuario);
		
	}

}

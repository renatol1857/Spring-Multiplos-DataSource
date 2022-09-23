package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.local.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario criar(@RequestBody Usuario usuario) {
		return usuarioService.criar(usuario);
	}
	
	@GetMapping
	public List<Usuario> obterUsuarios(){
		System.out.println("obterUsuarios");
		return usuarioService.obeterUsuarios();
	}
}

package com.example.demo.services;

import java.util.List;

import com.example.demo.model.local.Usuario;

public interface UsuarioService {
	
	public Usuario criar(Usuario usuario); 
	public List<Usuario> obeterUsuarios();

}

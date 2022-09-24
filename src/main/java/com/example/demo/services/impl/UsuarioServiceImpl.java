package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.local.Usuario;
import com.example.demo.repositories.local.UsuarioRepository;
import com.example.demo.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario criar(Usuario usuario) {
		System.out.println("UsuarioServiceImpl.criar");
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> obeterUsuarios() {
		return usuarioRepository.findAll();
	}

}

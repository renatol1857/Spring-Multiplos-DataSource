package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.app.Livro;
import com.example.demo.model.local.Usuario;
import com.example.demo.repositories.app.LivroRepository;
import com.example.demo.repositories.local.UsuarioRepository;
import com.example.demo.services.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Livro> obterLivros() {
		return livroRepository.findAll();
	}

	@Override
	public Livro criar(Livro livro) {
		System.out.println("LivroServiceImpl.criar");
		 Usuario usuario = usuarioRepository.findById(livro.getCodUsuario()).orElseThrow(() -> new IllegalArgumentException("Usuario nao encontrado."));
		 livro.setNomeUsuario(usuario.getNome());
		 return livroRepository.save(livro);
		 }

	
}

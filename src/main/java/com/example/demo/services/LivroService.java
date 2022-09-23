package com.example.demo.services;

import java.util.List;

import com.example.demo.model.app.Livro;

public interface LivroService {
	
	public List<Livro> obterLivros();
	public Livro criar(Livro livro);

}

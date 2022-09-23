package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Livro;
import com.example.demo.repostories.LivroRepository;
import com.example.demo.services.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	@Autowired
	private LivroRepository livroRepository;
	
	@Override
	public List<Livro> obterLivros() {
		return livroRepository.findAll();
	}

	
}

package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livro;
import com.example.demo.services.LivroService;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> obterLivros(){
		return livroService.obterLivros();
	}
}

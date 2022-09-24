package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.app.Livro;
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
	
	@PostMapping
	public ResponseEntity<Object> salvarLivro(@RequestBody Livro livro) {
		System.out.println("salvarLivro");
		try {
			Livro livro2 = livroService.criar(livro);
			return ResponseEntity.status(HttpStatus.CREATED).body(livro2);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
			}
		
	}
}

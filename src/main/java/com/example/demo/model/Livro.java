package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Livro {
	@Id
	private Integer id;
	private String titulo;
	private String autor;
	private String tema;
	
	@Column(name = "nome_usuario")
	private String nomeUsuario;

	public Livro(String titulo, String autor, String tema, String nomeUsuario) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		this.nomeUsuario = nomeUsuario;
	}
	
	
	

}

package com.example.demo.model.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String autor;
	private String tema;
	
	@Column(name = "nome_usuario")
	private String nomeUsuario;
	
	@Transient
	private Integer codUsuario;

	public Livro(String titulo, String autor, String tema, String nomeUsuario) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		this.nomeUsuario = nomeUsuario;
	}
	
	
	

}

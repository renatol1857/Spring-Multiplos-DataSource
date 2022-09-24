package com.example.demo.repositories.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}

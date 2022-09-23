package com.example.demo.repositories.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.app.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}

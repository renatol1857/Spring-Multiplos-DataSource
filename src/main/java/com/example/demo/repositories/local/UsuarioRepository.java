package com.example.demo.repositories.local;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.local.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

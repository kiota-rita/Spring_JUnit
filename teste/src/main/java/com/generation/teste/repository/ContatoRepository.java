package com.generation.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.teste.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}

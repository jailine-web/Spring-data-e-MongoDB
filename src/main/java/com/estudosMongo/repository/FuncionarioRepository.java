package com.estudosMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estudosMongo.entities.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}

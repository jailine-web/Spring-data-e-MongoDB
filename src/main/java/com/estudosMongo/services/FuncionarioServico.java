package com.estudosMongo.services;

import java.util.List;

import com.estudosMongo.entities.Funcionario;

public interface FuncionarioServico {

	public List<Funcionario> obterTodos();
	
	public Funcionario obterPorCodigo(String id);
	
	public Funcionario criar(Funcionario f);
	
	public List<Funcionario> obterFuncionariosIdade(Integer de, Integer ate);
	
	public List<Funcionario> findByNome(String nome);
	
}

package com.estudosMongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosMongo.entities.Funcionario;
import com.estudosMongo.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioServico {

	@Autowired
	private FuncionarioRepository funcRepo;
	
	
	@Override
	public List<Funcionario> obterTodos() {
		return funcRepo.findAll();
	}

	@Override
	public Funcionario obterPorCodigo(String id) {
		return funcRepo
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("O funcionário não existe"));
	}

	@Override
	public Funcionario criar(Funcionario f) {
		Funcionario supervisor =  funcRepo.findById(f.getSupervisor().getCodigo())
				.orElseThrow(()-> new IllegalArgumentException("Supervisor não encontrado"));
		
		f.setSupervisor(supervisor);
		
		return funcRepo.save(f);
	}


	@Override
	public List<Funcionario> obterFuncionariosIdade(Integer de, Integer ate) {
		return funcRepo.obterFuncionarioPorIntervaloDeIdade(de, ate);
	}

	@Override
	public List<Funcionario> findByNome(String nome) {
		return funcRepo.findByNome(nome) ;
	}

}

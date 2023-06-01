package com.estudosMongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosMongo.entities.Funcionario;
import com.estudosMongo.services.FuncionarioServico;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioServico funService;
	
	@GetMapping
	public List<Funcionario> obterTodos() {
		return funService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public Funcionario obterPorCodigo(@PathVariable String id) {
		return funService.obterPorCodigo(id);
	}
	
	@PostMapping
	public Funcionario criar(@RequestBody Funcionario funcionario) {
		return funService.criar(funcionario);
	}
	
}

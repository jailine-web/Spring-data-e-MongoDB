package com.estudosMongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/{id}")
	public Funcionario obterPorCodigo(@PathVariable String id) {
		return funService.obterPorCodigo(id);
	}
	
	@PostMapping
	public Funcionario criar(@RequestBody Funcionario funcionario) {
		return funService.criar(funcionario);
	}
	
	@GetMapping("/range")
	public List<Funcionario> obterFuncionarioIdade(@RequestParam("de") Integer de , @RequestParam("ate") Integer ate) {
		return this.funService.obterFuncionariosIdade(de, ate);
	}
	
	@GetMapping("/por-nome")
	public List<Funcionario> obterFuncionarioNome(@RequestParam("nome") String nome) {
		return this.funService.findByNome(nome);

	}
}

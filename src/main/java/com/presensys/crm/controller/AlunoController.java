package com.presensys.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.presensys.crm.model.Aluno;
import com.presensys.crm.repository.AlunoRepository;

@RestController	
@RequestMapping("/alunos")
public class AlunoController {

		@Autowired
		private AlunoRepository alunoRepository;
	
		@GetMapping
		public List<Aluno> listar() {
			return alunoRepository.findAll();
		}
		
		@PostMapping
		public Aluno adicionar(@RequestBody Aluno aluno) {
			return alunoRepository.save(aluno);
		}
}

package com.presensys.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.presensys.crm.model.Aluno;

// Responsavel pela interacao com o banco de dados
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}

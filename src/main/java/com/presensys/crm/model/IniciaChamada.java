package com.presensys.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Entity
public class Chamada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHoraInicio;

    @ManyToOne
    private List<Aluno> alunos;

    @Autowired
    private ChamadaRepository chamadaRepository;

    @Transactional
    public Chamada iniciarChamada() {
        try {
            Chamada chamada = new Chamada();
            chamada.setDataHoraInicio(LocalDateTime.now());

            if (chamada.getAlunos() == null || chamada.getAlunos().isEmpty()) {
                throw new RuntimeException("Falha ao iniciar a chamada. Nenhum aluno associado.");
            }

            return chamadaRepository.save(chamada);
        } catch (Exception e) {
            System.err.println("Erro durante a criação da chamada: " + e.getMessage());
            throw new RuntimeException("Erro durante a criação da chamada. Consulte os logs para mais detalhes.");
        }
    }
}

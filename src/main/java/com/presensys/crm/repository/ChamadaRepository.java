package com.presensys.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

import com.presensys.crm.model.Chamada;

public interface ChamadaRepository extends JpaRepository<Chamada, Long> {
    // Método de consulta personalizado para buscar chamadas por data
    List<Chamada> findByDataHoraInicioBetween(LocalDateTime startDate, LocalDateTime endDate);
}

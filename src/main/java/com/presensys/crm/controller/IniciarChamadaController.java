package com.presensys.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.presensys.crm.model.Chamada;
import com.presensys.crm.service.IniciarChamadaService;

@RestController
@RequestMapping("/chamada")
public class IniciaChamadaController {

    @Autowired
    private IniciarChamadaService iniciarChamadaService;

    @PostMapping("/iniciar")
    public Chamada iniciarChamada() {
        return iniciarChamadaService.iniciarChamada();
    }
}

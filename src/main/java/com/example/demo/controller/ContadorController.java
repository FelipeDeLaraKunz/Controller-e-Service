package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ContadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ContadorController {
    
    private final ContadorService contadorService;

    public ContadorController(ContadorService contadorService) {
        this.contadorService = contadorService;
    }

    @GetMapping("/contar/{texto}")
    public String getMethodName(@PathVariable String texto) {
        int resultado = contadorService.contarCaracteres(texto);
        return "Número de caracteres: " + resultado;
    }
}

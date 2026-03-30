package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ParService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ParController {
    private final ParService parService;

    public ParController(ParService parService) {
        this.parService = parService;
    }

    @GetMapping("/verificador/{numero}")
    public boolean getMethodName(@PathVariable int numero) {
        return parService.verificarPar(numero);
}
}

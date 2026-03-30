package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ConversorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ConversorController {
    private final ConversorService conversorService;

    public ConversorController(ConversorService conversorService) {
        this.conversorService = conversorService;
    }


    @GetMapping("/conversor/{temp}")
    public String getMethodName(@PathVariable int temp) {
        int resultado = conversorService.conversor(temp);
        return "é igual a: " + resultado + " Fahrenheit.";
    }
    
}

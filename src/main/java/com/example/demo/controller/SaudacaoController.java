package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.SaudacaoService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class SaudacaoController {
    private final  SaudacaoService saudacaoService;

    public SaudacaoController(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    @GetMapping("/saudacao/{nome}")
    public String getSaudacao(@PathVariable String nome, Model model) {
        String saudacao = saudacaoService.gerarMensagem(nome);
        model.addAttribute("saudacao", saudacao);
        return saudacao;
    }
    
}

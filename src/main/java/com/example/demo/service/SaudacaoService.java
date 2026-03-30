package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SaudacaoService {
    public String gerarMensagem(String nome) {
        return "Bem-vindo " + nome + "!";
    }
}

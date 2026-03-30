package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ContadorService {
    
    public int contarCaracteres(String texto) {
        if(texto == null) {
            return 0;
        }
        String semEspacos = texto.replace(" ", "");
        return semEspacos.length();
    }
}

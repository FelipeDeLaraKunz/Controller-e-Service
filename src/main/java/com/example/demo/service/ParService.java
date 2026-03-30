package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ParService {
    public boolean verificarPar(int numero) {
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorService {
    public int conversor(int temp) {
        return (temp*9/5) + 32;
    }
}

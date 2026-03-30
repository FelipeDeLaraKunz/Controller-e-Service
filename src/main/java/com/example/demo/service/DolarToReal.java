package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DolarToReal {
    public double conversorReal(double Real) {
        return Real * 5.25;
    }

    public double conversorDolar(double Dolar) {
        return Dolar / 5.25;
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DolarToReal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class DolartoRealController {

    private final DolarToReal dolarToReal;
    
    public DolartoRealController(DolarToReal dolarToReal){
        this.dolarToReal = dolarToReal;
    }

    @GetMapping("/Dolar/{dolar}")
    public double getMethodName(@PathVariable double dolar) {
        return dolarToReal.conversorDolar(dolar);
    }

    @GetMapping("Real/{real}")
    public double getMethod(@PathVariable double real) {
        return dolarToReal.conversorReal(real);
    }
    
}

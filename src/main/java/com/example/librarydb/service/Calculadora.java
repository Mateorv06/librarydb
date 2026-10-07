package com.example.librarydb.service;

public class Calculadora {
    public Double sumar(Double a, Double b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }
}

 
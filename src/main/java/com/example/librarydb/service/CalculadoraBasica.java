package com.example.librarydb.service;
// Clase que contendrá los métodos para la demostración de Pruebas unitarias
public class CalculadoraBasica {
    public Double sumar(Double a, Double b){
        if (a == null || b == null){
            return null;
        }
        return a + b;
    }

    public Double dividir(Double a, Double b){
        if (a == null || b == null || b == 0){
            // Lanzar una excepcion
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

}

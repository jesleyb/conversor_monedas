/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.modelo;

/**
 * Clase que almacena cada divisa
 * @author Sony
 */
public class Moneda {
    private final String pais;
    private final String divisa;
    private final float dolar;
    
    public Moneda(String pais, String divisa, float dolar) {
        this.pais = pais;
        this.divisa = divisa;
        this.dolar = dolar;
    }
    
    public String getPais() {
        return pais;
    }
    
    public String getDivisa() {
        return divisa;
    }
    
    public float getDolar() {
        return dolar;
    }
    
    @Override
    public String toString() {
        return String.format("%s - %s", pais, divisa);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor;

import com.alura.conversor.controlador.Control;
import com.alura.conversor.vista.JFrMain;

/**
 * Clase Principal
 * @author Sony
 */
public class Main {

    public static void main(String[] args) {
        try {
            Control control = new Control();
            JFrMain jfrmain = new JFrMain(control);
            control.setVista(jfrmain);
            control.mostrar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

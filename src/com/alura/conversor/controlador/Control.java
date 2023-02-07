/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.controlador;

import com.alura.conversor.modelo.Moneda;
import com.alura.conversor.modelo.Portapapeles;
import com.alura.conversor.vista.JFrMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Clase que maneja las acciones de los botones
 * @author Sony
 */
public class Control implements ActionListener {

    private JFrMain vista;
    public static final String CONVERTIR = "Convertir";
    public static final String COPIAR_ORIGEN = "Copiar origen";
    public static final String COPIAR_DESTINO = "Copiar destino";
    public static final String PEGAR_ORIGEN = "Pegar origen";
    public static final String PEGAR_DESTINO = "Pegar destino";
    public static final String LIMPIAR_ORIGEN = "Limpiar origen";
    public static final String LIMPIAR_DESTINO = "Limpiar destino";
    private final DecimalFormat decimalFormat = new DecimalFormat("########0.00000");

    /**
     * Establece la vista
     *
     * @param vista
     */
    public void setVista(JFrMain vista) {
        this.vista = vista;
    }

    /**
     * Muestra la pantalla principal
     */
    public void mostrar() {
        vista.setVisible(true);
        vista.enfoqueTxtOrigen();
    }

    /**
     * Procesa las acciones de los botones
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case CONVERTIR: 
                try {
                    double origen = Double.parseDouble(vista.getTextOrigen());
                    Moneda monedaOrigen = vista.getDivisaOrigen();
                    Moneda monedaDestino = vista.getDivisaDestino();
                    double destino = (origen * monedaOrigen.getDolar()) / monedaDestino.getDolar();
                    String resultado = decimalFormat.format(destino);
                    vista.setTextDestino(resultado);
                } catch (NumberFormatException ex) {
                    vista.escribe_pantalla("Moneda origen no valida");
                    vista.enfoqueTxtOrigen();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }   
                break;
            case COPIAR_ORIGEN:
                Portapapeles.copiar(vista.getTextOrigen());
                break;
            case COPIAR_DESTINO:
                Portapapeles.copiar(vista.getTextDestino());
                break;
            case PEGAR_ORIGEN:
                vista.setTextOrigen(Portapapeles.pegar());
                break;
            case PEGAR_DESTINO:
                vista.setTextDestino(Portapapeles.pegar());
                break;
            case LIMPIAR_ORIGEN:
                vista.setTextOrigen("");
                break;
            case LIMPIAR_DESTINO:
                vista.setTextDestino("");
                break;
        }
    }
}

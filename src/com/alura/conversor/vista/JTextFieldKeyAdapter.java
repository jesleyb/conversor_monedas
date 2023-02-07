/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * Clase que solo permite escribir numeros y solo un punto decimal en un JTextField
 * @author Sony
 */
public class JTextFieldKeyAdapter extends KeyAdapter {

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        JTextField jtextfield = (JTextField) e.getSource();
        String texto = jtextfield.getText();
        String sel = jtextfield.getSelectedText();
        if (sel != null) {
            texto = texto.replace(sel, "");
        }
        if (!(c == '.' && !texto.contains(".")) && (isPrintableChar(c) && !Character.isDigit(c))) {
            e.consume();
        }
    }

    private boolean isPrintableChar(char c) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(c);
        return (!Character.isISOControl(c))
                && c != KeyEvent.CHAR_UNDEFINED
                && block != null
                && block != Character.UnicodeBlock.SPECIALS;
    }
}

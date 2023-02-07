/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.modelo;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

/**
 * Clase para manejar el portapapeles
 * @author Sony
 */
public class Portapapeles {

    /**
     * Copia un texto al portapapeles
     *
     * @param texto
     */
    public static void copiar(String texto) {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection data = new StringSelection(texto);
            clipboard.setContents(data, data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Obtiene texto copiado al portapeles
     *
     * @return
     */
    public static String pegar() {
        String texto = "";

        try {
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            if (cb.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
                DataFlavor dataFlavorStringJava = DataFlavor.stringFlavor;
                Transferable t = cb.getContents(Portapapeles.class);
                if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                    texto = (String) t.getTransferData(dataFlavorStringJava);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return texto;
    }
}

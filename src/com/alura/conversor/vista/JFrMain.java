/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.vista;

import com.alura.conversor.controlador.Control;
import com.alura.conversor.modelo.Moneda;
import com.alura.conversor.modelo.MonedasArray;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase que crea la pantalla principal
 * @author Sony
 */
public class JFrMain extends JFrame {

    private final Control control;
    private final Font GFONT = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    private final JComboBox<Moneda> cboOrigen, cboDestino;
    private JButton btnConvertir;
    private final JTextField txtOrigen, txtDestino;

    public JFrMain(Control control) {
        super();
        this.control = control;
        cboOrigen = getJComboBox();
        txtOrigen = getJTextField();
        cboDestino = getJComboBox();
        txtDestino = getJTextField();
        initComponents();
    }

    /**
     * Crea la interfaz
     */
    private void initComponents() {
        JPanel jPanelMain = new JPanel(new BorderLayout());
        jPanelMain.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));

        JLabel lblTitulo = new JLabel("= Conversor de Divisas =", JLabel.CENTER);
        lblTitulo.setFont(GFONT);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        jPanelMain.add(lblTitulo, BorderLayout.NORTH);

        JPanel jPanelCenter = new JPanel(new BorderLayout());
        jPanelCenter.add(getVBox("Moneda origen:", cboOrigen, txtOrigen), BorderLayout.WEST);
        jPanelCenter.add(getBtnConvertir(), BorderLayout.CENTER);
        jPanelCenter.add(getVBox("Moneda destino:", cboDestino, txtDestino), BorderLayout.EAST);
        jPanelMain.add(jPanelCenter, BorderLayout.CENTER);
        
        cboOrigen.setSelectedIndex(43);  // Mexico - Pesos
        cboDestino.setSelectedIndex(23); // Estados Unidos de América - Dólar

        this.add(jPanelMain);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CHALLENGE ALURA - Conversor de Monedas");
        this.pack();
        this.setLocationRelativeTo(null);        
    }

    /**
     * Obtiene una barra vertical
     *
     * @return
     */
    private Box getVBox(String label, JComboBox jComboBox, JTextField jTextField) {
        Box vbox = Box.createVerticalBox();
        vbox.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        vbox.setPreferredSize(new Dimension(250, 160));
        vbox.add(new JLabel(label));
        vbox.add(jComboBox);
        vbox.add(jTextField);
        vbox.add(getBotones(jTextField));
        return vbox;
    }

    /**
     * Obtiene una Box con el boton convertir
     * @return 
     */
    private Box getBtnConvertir() {
        Box vboxBtn = Box.createVerticalBox();
        btnConvertir = new JButton();
        btnConvertir.addActionListener(control);
        btnConvertir.setActionCommand(Control.CONVERTIR);
        btnConvertir.setToolTipText("Convertir");
        btnConvertir.setIcon(getIcono("convertir48.png"));
        Dimension btnDim = new Dimension(80, 67);
        btnConvertir.setPreferredSize(btnDim);
        btnConvertir.setMaximumSize(btnDim);
        btnConvertir.setMinimumSize(btnDim);
        JLabel lblVacio = new JLabel();
        Dimension lblDim = new Dimension(80, 61);
        lblVacio.setPreferredSize(lblDim);
        lblVacio.setMaximumSize(lblDim);
        lblVacio.setMinimumSize(lblDim);
        vboxBtn.add(lblVacio);
        vboxBtn.add(btnConvertir);
        return vboxBtn;
    }

    /**
     * Obtiene el combobox con las divisas
     *
     * @return
     */
    private JComboBox getJComboBox() {
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        Moneda[] MONEDAS = MonedasArray.getMonedas();
        for (Moneda moneda : MONEDAS) {
            cboModel.addElement(moneda);
        }
        JComboBox<Moneda> jComboBox = new JComboBox(cboModel);
        jComboBox.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        return jComboBox;
    }

    /**
     * Obtiene la caja de texto a donde mostrar la cantidad
     *
     * @return
     */
    private JTextField getJTextField() {
        JTextField jTextField = new JTextField("0.00");
        jTextField.setFont(GFONT);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.addKeyListener(new JTextFieldKeyAdapter());
        return jTextField;
    }

    /**
     * Obtiene los botones de copiar, pegar y limpiar
     *
     * @return
     */
    private JPanel getBotones(JTextField jTextField) {
        JPanel jpanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 2));
        JButton btnCopiar = new JButton();
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.setIcon(getIcono("copiar16.png"));
        btnCopiar.addActionListener(control);
        btnCopiar.setActionCommand(jTextField.equals(txtOrigen) ? Control.COPIAR_ORIGEN : Control.COPIAR_DESTINO);
        jpanel.add(btnCopiar);
        JButton btnPegar = new JButton();
        btnPegar.setToolTipText("Pegar");
        btnPegar.setIcon(getIcono("pegar16.png"));
        btnPegar.addActionListener(control);
        btnPegar.setActionCommand(jTextField.equals(txtOrigen) ? Control.PEGAR_ORIGEN : Control.PEGAR_DESTINO);
        jpanel.add(btnPegar);
        JButton btnLimpiar = new JButton();
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.setIcon(getIcono("limpiar16.png"));
        btnLimpiar.addActionListener(control);
        btnLimpiar.setActionCommand(jTextField.equals(txtOrigen) ? Control.LIMPIAR_ORIGEN : Control.LIMPIAR_DESTINO);
        jpanel.add(btnLimpiar);
        return jpanel;
    }

    /**
     * Obtiene una imagen como ImageIcon
     *
     * @param img
     * @return
     */
    private ImageIcon getIcono(String img) {
        URL recurso = JFrMain.class.getResource("/com/alura/conversor/vista/recursos/" + img);
        return recurso == null ? null : new ImageIcon(Toolkit.getDefaultToolkit().getImage(recurso));
    }
    
    /**
     * Da el enfoque a txtOrigen
     */
    public void enfoqueTxtOrigen() {
        txtOrigen.selectAll();
        txtOrigen.requestFocus();
    }
    /**
     * Obtiene el texto de origen
     * @return 
     */
    public String getTextOrigen() {
        return txtOrigen.getText();
    }
    
    /**
     * Establece el texto origen
     * @param text 
     */
    public void setTextOrigen(String text) {
        txtOrigen.setText(text);
    }
    
    /**
     * Obtiene el texto de destino
     * @return 
     */
    public String getTextDestino() {
        return txtDestino.getText();
    }
    
    /**
     * Establece el texto destino
     * @param text 
     */
    public void setTextDestino(String text) {
        txtDestino.setText(text);
    }
    
    /**
     * Obtiene la divisa de origen
     * @return 
     */
    public Moneda getDivisaOrigen() {
        return (Moneda) cboOrigen.getSelectedItem();
    }

    /**
     * Obtiene la divisa destino
     * @return 
     */
    public Moneda getDivisaDestino() {
        return (Moneda) cboDestino.getSelectedItem();
    }
    
    /**
     * Escribe un mensaje en pantalla
     *
     * @param msj Mensaje
     */
    public void escribe_pantalla(Object msj) {
        JOptionPane.showMessageDialog(this, msj);
    }

}

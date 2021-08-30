/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.OperacionLogica;
import vista.Calculadora;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {

    Calculadora calc = new Calculadora();
    OperacionLogica ol = new OperacionLogica();
    File archivo;

    public Controlador(Calculadora calc, OperacionLogica ol) {
        this.calc = calc;
        this.ol = ol;

        this.calc.jMenu1.addActionListener(this);
        this.calc.jcbOpciones.addActionListener(this);
        this.calc.jcbOpciones2.addActionListener(this);
        this.calc.jmiGuardar.addActionListener(this);
        this.calc.jbnResultado.addActionListener(this);
        this.calc.jbnResultado2.addActionListener(this);
        this.calc.jtfPrimero.addActionListener(this);
        this.calc.jtfSegundo.addActionListener(this);
        this.calc.jfcMenu.addActionListener(this);
        calc.jlbFecha.setText(ol.Fecha());

    }

    public void Operador() {
        ol.setN1(Integer.parseInt(calc.jtfPrimero.getText()));
        ol.setN2(Integer.parseInt(calc.jtfSegundo.getText()));
        ol.setPalabra(calc.jcbOpciones.getSelectedItem().toString());
        calc.jtaTexto.setText(""+ol.Palabras());
    }

    public void OperadorExtra() {
        //ol.setN1(Integer.parseInt(calc.jtfPrimero.getText()));
        //ol.setN2(Integer.parseInt(calc.jtfSegundo.getText()));
        ol.setPalabra2(calc.jcbOpciones2.getSelectedItem().toString());
        calc.jtaTexto.setText("Extras: " + ol.PalabrasExtras());

    }

    public void Guardar() {
        if (calc.jfcMenu.showDialog(null, "Guardar archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = calc.jfcMenu.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String contenido = calc.jtaTexto.getText();
                String respuesta = ol.GuardarTexto(archivo, contenido);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "error al guardar txt");
                }
            } else {
                JOptionPane.showMessageDialog(null, "el texto se debe guardar en un formato de texto");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calc.jbnResultado) {
            this.Operador();
        }
        if (e.getSource() == calc.jmiGuardar) {
            this.Guardar();
        }
        if (e.getSource() == calc.jbnResultado2) {
            this.OperadorExtra();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Gestion;
import Vista.Texto;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class Controlador implements ActionListener {

    Texto vista = new Texto();
    Gestion ges = new Gestion();

    public Controlador(Texto vista, Gestion ges) {
        this.vista = vista;
        this.ges = ges;

        this.vista.jmiAbrir.addActionListener(this);
        this.vista.jmiGuardar.addActionListener(this);
        //this.vista.jtaEditar.addAncestorListener(this);
        this.vista.jfcMenu.addActionListener(this);
        this.vista.jmiMayusculas.addActionListener(this);
        this.vista.jmiMinisculas.addActionListener(this);
        this.vista.jmiNegrita.addActionListener(this);
        this.vista.jmiNormal.addActionListener(this);

    }
    File archivo;

    public void abrir() {
        if (vista.jfcMenu.showDialog(null, "abrir archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = vista.jfcMenu.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String contenido = ges.AbrirTexto(archivo);
                    vista.jtaEditar.setText(contenido);
                }
            }
        }
    }

    public void Guardar() {
        if (vista.jfcMenu.showDialog(null, "Guardar archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = vista.jfcMenu.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String contenido = vista.jtaEditar.getText();
                String respuesta = ges.GuardarTexto(archivo, contenido);
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
        if (e.getSource() == vista.jmiAbrir) {
            this.abrir();
        }
        if (e.getSource() == vista.jmiGuardar) {
            this.Guardar();
        }
        if (e.getSource() == vista.jmiMinisculas) {
            String texto = vista.jtaEditar.getText();
            vista.jtaEditar.setText(texto.toLowerCase());
        }
        if (e.getSource() == vista.jmiMayusculas) {
            String texto = vista.jtaEditar.getText();
            vista.jtaEditar.setText(texto.toUpperCase());
        }
        if (e.getSource() == vista.jmiNegrita) {
            Font fuente;
            fuente = new Font("Serief", Font.BOLD | Font.ITALIC, 14);
            vista.jtaEditar.setFont(fuente);
        }
                if (e.getSource() == vista.jmiNormal) {
            Font fuente;
            fuente = new Font("Serief",Font.PLAIN,14);
		vista.jtaEditar.setFont(fuente);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloLogica;
import vista.Operaciones;

/**
 *
 * @author John
 */
public class Controlador implements ActionListener {

    Operaciones vista = new Operaciones();
    ModeloLogica modelo = new ModeloLogica();

    public Controlador(Operaciones vista, ModeloLogica modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.BtnSumar.addActionListener(this);
        this.vista.BtnRestar.addActionListener(this);
        this.vista.BtnMultiplicar.addActionListener(this);
        this.vista.BtnDividir.addActionListener(this);
    }

    private void sum() {
        this.modelo.setN1(Integer.parseInt(vista.TxtNum1.getText()));
        this.modelo.setN2(Integer.parseInt(vista.TxtNum2.getText()));
        vista.JopResultado.showMessageDialog(null, modelo.suma());
    }

    private void res() {
        this.modelo.setN1(Integer.parseInt(vista.TxtNum1.getText()));
        this.modelo.setN2(Integer.parseInt(vista.TxtNum2.getText()));
        vista.JopResultado.showMessageDialog(null, modelo.resta());
    }

    private void mul() {
        this.modelo.setN1(Integer.parseInt(vista.TxtNum1.getText()));
        this.modelo.setN2(Integer.parseInt(vista.TxtNum2.getText()));
        vista.JopResultado.showMessageDialog(null, modelo.multi());
    }

    private void div() {
        this.modelo.setN11(Double.parseDouble(vista.TxtNum1.getText()));
        this.modelo.setN12(Double.parseDouble(vista.TxtNum2.getText()));
        vista.JopResultado.showMessageDialog(null, modelo.divicion());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BtnSumar) {
            this.sum();
        }
        if (e.getSource() == vista.BtnRestar) {
            this.res();
        }
        if (e.getSource() == vista.BtnMultiplicar) {
            this.mul();
        }
        if (e.getSource() == vista.BtnDividir) {
            this.div();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmMostrar;

/**
 *
 * @author John
 */
public class ControladorMostrar implements ActionListener, WindowListener {

    FrmMostrar vista = new FrmMostrar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorMostrar(FrmMostrar vista, PaisVO pvo, PaisDAO pdao) {
        this.vista = vista;
        this.pvo = pvo;
        this.pdao = pdao;

        vista.addWindowListener(this);
        vista.btnReporte.addActionListener(this);
    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("Id");
        m.addColumn("Nombre del pais");
        m.addColumn("Capital del pais");
        m.addColumn("Poblacion del pais");

        for (PaisVO pvo : pdao.consultarTabla()) {
            m.addRow(new Object[]{pvo.getId_pais(), pvo.getNombre_pais(), pvo.getCapital_pais(), pvo.getPoblacion_pais()});

        }
        vista.tblMostrar.setModel(m);
    }
    
    public void reporte(){
        pdao.reporte();
        pdao.jv.setDefaultCloseOperation(vista.DISPOSE_ON_CLOSE);
        pdao.jv.setVisible(true);
    } 

    @Override
    public void windowOpened(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnReporte){
            this.reporte();
        }
}

}

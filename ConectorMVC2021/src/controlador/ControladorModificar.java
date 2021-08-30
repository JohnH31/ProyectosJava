/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmActualizar;
import vista.frmModificar;

/**
 *
 * @author John
 */
public class ControladorModificar implements ActionListener, MouseListener, WindowListener {

    frmModificar vista = new frmModificar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    FrmActualizar ac = new FrmActualizar();

    public ControladorModificar(frmModificar vista, PaisVO pvo, PaisDAO pdao, FrmActualizar ac) {
        this.vista = vista;
        this.pvo = pvo;
        this.pdao = pdao;
        this.ac = ac;

        vista.addWindowListener(this);
        ac.btnActualizar.addActionListener(this);
        vista.tblModificar.addMouseListener(this);

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
        vista.tblModificar.setModel(m);
    }

    private void datos() {
        int row;
        row = vista.tblModificar.getSelectedRow();
        pvo.setId_pais(Integer.parseInt(vista.tblModificar.getValueAt(row, 0).toString()));
        ac.txtNombre.setText(String.valueOf(vista.tblModificar.getValueAt(row, 1)));
        ac.txtCapital.setText(String.valueOf(vista.tblModificar.getValueAt(row, 2)));
        ac.txtPoblacion.setText(String.valueOf(vista.tblModificar.getValueAt(row, 3)));

    }

    private void modi() {
        try {
            pvo.getId_pais();
            pvo.setNombre_pais(ac.txtNombre.getText());
            pvo.setCapital_pais(ac.txtCapital.getText());
            pvo.setPoblacion_pais(Long.parseLong(ac.txtPoblacion.getText()));
            pdao.actualizar(pvo);
            JOptionPane.showMessageDialog(null,"Registro Modificado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Debe ingresar Datos para Modificar registro");
        }
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
        if (e.getSource() == ac.btnActualizar) {
            this.modi();
            ac.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.datos();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ac.setVisible(true);
        ac.setLocationRelativeTo(null);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

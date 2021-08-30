/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Insertar;

/**
 *
 * @author John
 */
public class ControladorInsertar implements ActionListener{

    Frm_Insertar vIn = new Frm_Insertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    public ControladorInsertar(Frm_Insertar vIn,PaisVO pvo,PaisDAO pdao){
        this.vIn = vIn;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vIn.btnInsertar.addActionListener(this);
        vIn.btnCancelar.addActionListener(this);
        
    }
    
    private void insetarPais(){
        try{
        pvo.setNombre_pais(vIn.txtNombre.getText());
        pvo.setCapital_pais(vIn.txtCapital.getText());
        pvo.setPoblacion_pais(Long.parseLong(vIn.txtPoblacion.getText()));
        pdao.insertar(pvo);
        JOptionPane.showMessageDialog(null,"Registro Ingresado");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Debe ingresar Datos para guardar registro");
        }
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vIn.btnInsertar){
            this.insetarPais();
            vIn.dispose();
        }
        if(e.getSource() == vIn.btnCancelar){
            vIn.dispose();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectormvc2021;

import controlador.ControladorEliminar;
import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorModificar;
import controlador.ControladorMostrar;
import modelo.Conector;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmActualizar;
import vista.FrmEliminar;
import vista.FrmMostrar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.frmModificar;

/**
 *
 * @author John
 */
public class ConectorMVC2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Conector c = new Conector();
//        c.conectar();
        Frm_Menu me = new Frm_Menu();
        Frm_Insertar in = new Frm_Insertar();
        FrmMostrar mo = new FrmMostrar();
        frmModificar md = new frmModificar();
        FrmActualizar ac = new FrmActualizar();
        FrmEliminar eli = new FrmEliminar();
        
        PaisVO pvo = new PaisVO();
        PaisDAO pdao = new PaisDAO();
        
        
        ControladorMenu cm = new ControladorMenu(me,in,mo,md,eli);
        ControladorInsertar ci = new ControladorInsertar(in,pvo,pdao);
        ControladorMostrar mos = new ControladorMostrar(mo,pvo,pdao);
        ControladorEliminar ce = new ControladorEliminar(eli,pvo,pdao);
        ControladorModificar cmd = new ControladorModificar(md,pvo,pdao,ac);
        me.setVisible(true);
        me.setLocationRelativeTo(null);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadtext;

import Controlador.Controlador;
import Modelo.Gestion;
import Vista.Texto;

/**
 *
 * @author John
 */
public class ActividadText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Texto vista = new Texto();
        Gestion ges = new Gestion();
        Controlador c = new Controlador(vista, ges);
        vista.setVisible(true);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomvc;

import controlador.Controlador;
import modelo.ModeloLogica;
import vista.Operaciones;

/**
 *
 * @author John
 */
public class EjemploMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op = new Operaciones();
        ModeloLogica ml = new ModeloLogica();
        Controlador c = new Controlador(op, ml);
        op.setVisible(true);
    }
    
}

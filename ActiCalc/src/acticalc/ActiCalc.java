/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acticalc;

import controlador.Controlador;
import modelo.OperacionLogica;
import vista.Calculadora;

/**
 *
 * @author Usuario
 */
public class ActiCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();
        OperacionLogica ol = new OperacionLogica();
        Controlador c = new Controlador(calc,ol);
        calc.setVisible(true);
        
    }
    
}

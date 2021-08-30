/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglo4;

import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class EjercicioArreglo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio1
//        int dimension;
//          dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del arreglo"));
//          int[] elementos = new int[dimension];
//          for (int i = 0; i < dimension; i++) {
//              elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese datos en la posicion "+i));
//              System.out.println("Elemento ingresado: "+ elementos[i]);
//        }
//          System.out.println("datos ingresados");
//          for (int i = 0; i < dimension; i++) {
//              System.out.println(elementos[i]);
//        }
          //Ejercicio2
          String palabra;
          palabra = JOptionPane.showInputDialog("Ingrese Palabra");
          //char[] letra = new char[palabra.length()];
          for (int i = 0; i < palabra.length(); i++) {
              System.out.println(palabra.charAt(i));
              //letra[i] = palabra.charAt(i);
              //System.out.println(letra[i]);
        }
          System.out.println("Cantidad "+palabra.length());
        
    }
    
}

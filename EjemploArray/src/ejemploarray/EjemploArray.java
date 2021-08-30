/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int [] num = new int[2];
//        num[0]=7;
//        num[1]=9;
//        for(int i=0;i<num.length;i++){
//            System.out.println(num[i]);
//        }
//        int [] n = {1,2,3,4,5};
          Scanner sc = new Scanner(System.in);
          int dimension;
          dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del arreglo"));
          int[] elementos = new int[dimension];
          System.out.println("momento de llenar el arreglo");
          for (int i = 0; i < dimension; i++) {
              System.out.println("Ingrese datos en la posicion "+i);
              elementos[i] = sc.nextInt();
              
        }
          System.out.println("datos ingresados");
          for (int i = 0; i < dimension; i++) {
              System.out.println(elementos[i]);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscanner;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String nom;
        int eda;
        int edad =2021;
        System.out.println("Introduzca su nombre");
        nom = teclado.nextLine();
        System.out.println("Introduzca su edad");
        eda = teclado.nextInt();
        int resta = edad-eda;
        System.out.println(nom+" "+eda+" "+resta);
        System.out.println("Su nombre es "+nom +" y tiene "+eda+" años y nacio en el año "+resta);
    }
    
}

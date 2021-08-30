/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
//        int num1;
//        int num2;
//        System.out.println("Ingrese pimer numero");
//        num1 = teclado.nextInt();
//        System.out.println("Ingrese segundo numero");
//        num2 = teclado.nextInt();
//        if (num1==num2){
//            System.out.println(num1+" es igual a "+num2);
//        }
//        else {
//        System.out.println(num1+" no es igual a "+num2);
//    }
//            int num1;
//            System.out.println("Ingrese pimer numero");
//            num1 = teclado.nextInt();
//            if(num1<0){
//                System.out.println(num1 + " es negativo");
//            }
//            else if(num1==0){
//                System.out.println(num1 + " es neutro");
//            }
//            else{
//                System.out.println(num1 + " es positivo");
//            }
            int num1;
            int num2;
            System.out.println("Ingrese pimer numero");
            num1 = teclado.nextInt();
            System.out.println("Ingrese segundo numero");
            num2 = teclado.nextInt();
            if(num1>num2){
                System.out.println(num1 + " es mayor a "+num2);
            }
            else if(num1==num2){
                System.out.println(num1 + " es igual a "+num2);
            }
            else{
                System.out.println(num1 + " es menor a "+num2);
            }
            
    }
    
}

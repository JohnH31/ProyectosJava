/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofor;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 1
//        for(int i=0;i<=100;i+=2){
//            System.out.println("Numero: "+i);
//        }
        //Ejercicio 2
//          Scanner teclado = new Scanner(System.in);
//          int sueldo;
//          int suma=0;
//          int cout=0;
//          for(int i=0;i<10;i++){
//              System.out.println("Ingrese sueldo ");
//              sueldo = teclado.nextInt(); 
//              if(sueldo>5000){
//                  cout=cout+1;
//              }
//              suma = suma+sueldo;
//          }
//              System.out.println("Suma Sueldos: "+suma);
//              System.out.println("Los sueldos mayores a 5000 son: "+cout);
        //Ejercicio 2
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero de 0 a 10: ");
        num = teclado.nextInt();
        if (0>num||num<=10) {
            for (int i=0; i <=10; i++) {
                System.out.println(num+" * "+i+" = " + (num * i));
            }
        }else{
            System.out.println("valor no correcto");
        }
    }
}

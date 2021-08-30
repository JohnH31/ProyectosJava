/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswich;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioSwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
//        int mes;
//        System.out.println("Ingrese un numero segun el mes solicitado");
//        mes = teclado.nextInt();
//         
//        switch (mes) 
//        {
//            case 1:  System.out.println("Enero");
//                     break;
//            case 2:  System.out.println("Febrero");
//                     break;
//            case 3:  System.out.println("Marzo");
//                     break;
//            case 4:  System.out.println("Abirl");
//                     break;
//            case 5:  System.out.println("Mayo");
//                     break;
//            case 6:  System.out.println("Junio");
//                     break;
//            case 7:  System.out.println("Julio");
//                     break;
//            case 8:  System.out.println("Agosto");
//                     break;
//            case 9:  System.out.println("Septiembre");
//                     break;
//            case 10:  System.out.println("Octubre");
//                     break;
//            case 11:  System.out.println("Noviembre");
//                     break;
//            case 12:  System.out.println("Diciembre");
//                     break;         
//            default: System.out.println("Mes no valido");
//                     break;
//        }
        int nota;
        System.out.println("Ingrese una nota del 1 a 10");
        nota = teclado.nextInt();
         
        switch (nota) 
        {
            case 1:  System.out.println("Uno");
                     break;
            case 2:  System.out.println("Dos");
                     break;
            case 3:  System.out.println("Tres");
                     break;
            case 4:  System.out.println("Cuatro");
                     break;
            case 5:  System.out.println("Cinco");
                     break;
            case 6:  System.out.println("Seis");
                     break;
            case 7:  System.out.println("Siete");
                     break;
            case 8:  System.out.println("Ocho");
                     break;
            case 9:  System.out.println("Nueve");
                     break;
            case 10:  System.out.println("Diez");
                     break;
            default: System.out.println("Nota no valido");
                     break;
        }
    }
    
}

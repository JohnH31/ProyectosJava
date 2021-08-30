/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);
          //EJERCICIO 1
        int num;
        System.out.println("Esciba un numero de 0 a 9999");
        num = teclado.nextInt();
        if(0>=num||num<=9999){
            System.out.println("su numero tiene "+ Integer.toString(num).length()+"cifras");
        }
        else{
            System.out.println("su numero no es valido");
        }
        //EJERCICIO 2
//        int n1;
//        System.out.println("Esciba un numero de 0 a 10");
//        n1 = teclado.nextInt();
//        if(0>=n1||n1<=4){
//            System.out.println(n1+" Su numero es bajo");
//        }
//        else if (5>=n1||n1<=8){
//            System.out.println(n1+" Su numero es medio");
//        }
//        else if (9>=n1||n1<=10){
//            System.out.println(n1+" Su numero es alto");
//        }
//        else{
//            System.out.println("su numero no es valido");
//        }
            //EJERCICIO 3
//        int num1;
//        int num2;
//        System.out.println("Escriba primer numero ");
//        num1 = teclado.nextInt();
//        System.out.println("Escriba segundo numero ");
//        num2 = teclado.nextInt();
//        if(num1%2==0){
//            System.out.println("su primer numero es par");  
//        }
//        else{
//            System.out.println("su primer numero es impar");
//        }
//        if(num2%2==0){
//            System.out.println("su segundo numero es par");
//        }
//        else{
//            System.out.println("su segundo numero es impar");
//        }
        //EJERCICIO 4
//        int num1;
//        int num2;
//        int num3;
//        System.out.println("Escriba primer numero ");
//        num1 = teclado.nextInt();
//        System.out.println("Escriba segundo numero ");
//        num2 = teclado.nextInt();
//        System.out.println("Escriba segundo numero ");
//        num3 = teclado.nextInt();
//        if(num1>num2 && num2>num3){
//            System.out.println("Ordenar Mayor a Menor "+num1+"-"+num2+"-"+num3);
//        }
//        else if(num1>num3 && num3>num2){
//            System.out.println("Ordenar Mayor a Menor "+num1+"-"+num3+"-"+num2);
//        }
//        else if(num2>num1 && num1>num3){
//            System.out.println("Ordenar Mayor a Menor "+num2+"-"+num1+"-"+num3);    
//        }
//        else if(num2>num3 && num3>num1){
//            System.out.println("Ordenar Mayor a Menor "+num2+"-"+num3+"-"+num1);
//        }
//        else if(num3>num1 && num1>num2){
//            System.out.println("Ordenar Mayor a Menor "+num3+"-"+num1+"-"+num2);
//        }
//        else if(num3>num2 && num2>num1){
//            System.out.println("Ordenar Mayor a Menor "+num3+"-"+num2+"-"+num1);
//        }
//        else{
//            System.out.println("numero no ingresado");
//        }
    }    
}

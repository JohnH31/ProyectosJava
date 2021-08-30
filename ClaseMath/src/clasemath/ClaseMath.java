/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code
        Scanner sc = new Scanner(System.in);
        int num;
        boolean salir = false;
        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 Ejercicio1");
            System.out.println("2 Ejercicio2");
            System.out.println("3 Ejercicio3");
            System.out.println("4 Ejercicio4");
            System.out.println("5 Ejercicio5");
            System.out.println("6 Salir");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    int a;
                    int b;
                    System.out.println("ingrese dos numeros: ");
                    System.out.println("el programa le dira cual es el maximo");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("max(" + a + "," + b + ") es " + Math.max(a,b));
                    
                    break;
                case 2:
                    int c;
                    int d;
                    System.out.println("ingrese dos numeros: ");
                    System.out.println("el programa le dira cual es el minimo");
                    c = sc.nextInt();
                    d = sc.nextInt();
                    System.out.println("max(" + c + "," + d + ") es " + Math.min(c,d));

                    break;
                case 3:
                    int x;
                    System.out.println("ingrese un numeros: ");
                    System.out.println("el programa le dira cual es su raiz cuadrada");
                    x = sc.nextInt();
                    System.out.println("La raíz cuadrada de " + x + " is " + Math.sqrt(x));
                    break;
                case 4:
                    int y;
                    System.out.println("ingrese un numeros: ");
                    System.out.println("el programa le dira cual es su raiz cubica");
                    y = sc.nextInt();
                    System.out.println("La raíz cuadrada de " + y + " is " + Math.cbrt(y));
                    break;
                case 5:
                    int base;
                    int n;
                    System.out.println("ingrese la base: ");
                    base = sc.nextInt();
                    System.out.println("ingrese el exponente");
                    n = sc.nextInt();
                    System.out.println(base+" elevado a la " + n + " es igual a " + Math.pow(base,n));
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
                    break;
            }
        } while (!salir);
        System.out.println("Adios");
    }

}

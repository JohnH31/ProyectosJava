/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconmetodos;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjerciciosConMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones ope = new Operaciones();
        Condiciones con = new Condiciones();
        Scanner sc = new Scanner(System.in);
        int num;
        boolean salir = false;
        do {
            System.out.println("Operacions Aritmeticas");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplicacion");
            System.out.println("4 Divicion");
            System.out.println("Condiciones");
            System.out.println("5 Condicion if");
            System.out.println("6 Condicion if else");
            System.out.println("7 condicion if else if");
            System.out.println("8 condicion switch");
            System.out.println("0 Salir");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Sumar");
                    System.out.println("Ingrese primer numero ");
                    ope.n1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    ope.n2 = sc.nextInt();
                    System.out.println("el resultado de la suma es: " + ope.suma());
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("Ingrese primer numero ");
                    ope.n1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    ope.n2 = sc.nextInt();
                    System.out.println("el resultado de la suma es: " + ope.resta());
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    System.out.println("Ingrese primer numero ");
                    ope.n1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    ope.n2 = sc.nextInt();
                    System.out.println("el resultado de la suma es: " + ope.multi());
                    break;
                case 4:
                    System.out.println("Divicion");
                    System.out.println("Ingrese primer numero ");
                    ope.n1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    ope.n2 = sc.nextInt();
                    System.out.println("el resultado de la suma es: " + ope.divi());
                    break;
                case 5:
                    System.out.println("Identificar si eres mayor de edad");
                    System.out.println("Ingresa tu edad");
                    con.n1 = sc.nextInt();
                    System.out.println(con.edad());
                    break;
                case 6:
                    System.out.println("Escriba un numero se detectara si es par o impar");
                    System.out.println("Escrir numero ");
                    con.n1 = sc.nextInt();
                    System.out.println(con.parimpar());
                    break;
                case 7:
                    System.out.println("Ingrese 3 numeros se ordenara de mayor a menor");
                    System.out.println("Escriba primer numero ");
                    con.n1 = sc.nextInt();
                    System.out.println("Escriba segundo numero ");
                    con.n2 = sc.nextInt();
                    System.out.println("Escriba tercer numero ");
                    con.n3 = sc.nextInt();
                    System.out.println(con.mayormenor());
                    break;
                case 8:
                    System.out.println("Ingrese un numero segun el mes solicitado");
                    con.n1 = sc.nextInt();
                    System.out.println(+con.mes());
                    break;
                case 9:
                    break;
                case 0:
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

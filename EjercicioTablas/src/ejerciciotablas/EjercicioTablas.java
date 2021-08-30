/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotablas;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            int num;
            boolean salir = false;
            do {
                System.out.println("Clases de Primaria");
                System.out.println("1 Primero");
                System.out.println("2 Segundo");
                System.out.println("3 Tercero");
                System.out.println("4 Cuarto");
                System.out.println("5 Quinto");
                System.out.println("6 Sexto");
                System.out.println("0 Salir");
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        Primero pri = new Primero();
                        pri.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        pri.tablas();
                        break;
                    case 2:
                        Segundo seg = new Segundo();
                        seg.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        seg.tablas();
                        break;
                    case 3:
                        Tercero ter = new Tercero();
                        ter.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        ter.tablas();
                        break;
                    case 4:
                        Cuarto cua = new Cuarto();
                        cua.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        cua.tablas();
                        break;
                    case 5:
                        Quinto qui = new Quinto();
                        qui.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        qui.tablas();
                        break;
                    case 6:
                        Sexto sex = new Sexto();
                        sex.alumnos();
                        System.out.println("Las tablas de multiplicar a aprender son: ");
                        sex.tablas();
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
        } catch (Exception ex) {
            System.out.println("Dato ingresado no valido");
        }
    }

}

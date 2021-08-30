/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadabstracto;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class ActividadAbstracto {

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
                System.out.println("MENU ARREGLO: ");
                System.out.println("1 Adidas");
                System.out.println("2 Nike");
                System.out.println("3 Puma");
                System.out.println("0 Salir");
                System.out.print("Elegir una Opcion: ");
                num = sc.nextInt();
                sc.nextLine();
                switch (num) {
                    case 1:
                        try {
                            Trabajadores adi = new Empresa1();
                            System.out.println("ingrese nombres ");
                            adi.nombre = sc.nextLine();
                            System.out.println("ingrese apellidos ");
                            adi.apellido = sc.nextLine();
                            System.out.println("Ingrese edad ");
                            adi.edad = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ingrese direccion ");
                            adi.direccion = sc.nextLine();
                            System.out.println("ingrese sueldo ");
                            adi.sueldo = sc.nextInt();
                            System.out.println("*******DATOS DEL TRABAJADOR*******");
                            System.out.println("Nombres: " + adi.nombre);
                            System.out.println("Apellido: " + adi.apellido);
                            System.out.println("Edad: " + adi.edad);
                            System.out.println("Direccion: " + adi.direccion);
                            System.out.println("Sueldo: " + adi.sueldo);
                            System.out.println("Salario total por año: Q" + adi.sueldot());
                            System.out.println("Una comicion mas sueldo: Q" + adi.comicion());
                            System.out.println("**********************************");
                        } catch (Exception ex) {
                            System.out.println("Dato ingresado no valido");
                        }
                        break;
                    case 2:
                        try {
                            Trabajadores nik = new Empresa2();
                            System.out.println("ingrese nombres ");
                            nik.nombre = sc.nextLine();
                            System.out.println("ingrese apellidos ");
                            nik.apellido = sc.nextLine();
                            System.out.println("Ingrese edad ");
                            nik.edad = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ingrese direccion ");
                            nik.direccion = sc.nextLine();
                            System.out.println("ingrese sueldo ");
                            nik.sueldo = sc.nextInt();
                            System.out.println("*******DATOS DEL TRABAJADOR*******");
                            System.out.println("Nombres: " + nik.nombre);
                            System.out.println("Apellido: " + nik.apellido);
                            System.out.println("Edad: " + nik.edad);
                            System.out.println("Direccion: " + nik.direccion);
                            System.out.println("Sueldo: " + nik.sueldo);
                            System.out.println("Salario total por año: Q" + nik.sueldot());
                            System.out.println("Una comicion mas sueldo: Q" + nik.comicion());
                            System.out.println("**********************************");
                        } catch (Exception ex) {
                            System.out.println("Dato ingresado no valido");
                        }
                        break;
                    case 3:
                        try {
                            Trabajadores pum = new Empresa3();
                            System.out.println("ingrese nombres ");
                            pum.nombre = sc.nextLine();
                            System.out.println("ingrese apellidos ");
                            pum.apellido = sc.nextLine();
                            System.out.println("Ingrese edad ");
                            pum.edad = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ingrese direccion ");
                            pum.direccion = sc.nextLine();
                            System.out.println("ingrese sueldo ");
                            pum.sueldo = sc.nextInt();
                            System.out.println("*******DATOS DEL TRABAJADOR*******");
                            System.out.println("Nombres: " + pum.nombre);
                            System.out.println("Apellido: " + pum.apellido);
                            System.out.println("Edad: " + pum.edad);
                            System.out.println("Direccion: " + pum.direccion);
                            System.out.println("Sueldo: " + pum.sueldo);
                            System.out.println("Salario total por año: Q" + pum.sueldot());
                            System.out.println("Una comicion mas sueldo: Q" + pum.comicion());
                            System.out.println("**********************************");
                        } catch (Exception ex) {
                            System.out.println("Dato ingresado no valido");
                        }
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

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
public class Primero implements Tablas {

    public int tabla;
    public int alumnos;
    Scanner sc = new Scanner(System.in);

    @Override
    public void tablas() {
        tabla = 1;
        System.out.println("TABLA DEL 1");
        for (int i = 0; i < 11; i++) {
            System.out.println(tabla + "*" + i + " = " + tabla * i);
        }
        System.out.println("TABLA DEL 2");
        tabla = 2;
        for (int i = 0; i < 11; i++) {
            System.out.println(tabla + "*" + i + " = " + tabla * i);
        }
    }

    @Override
    public void alumnos() {
        try{
         System.out.println("Ingrese la cantidad de Alumnos:");
         alumnos = sc.nextInt();   
        } catch(Exception ex){
            System.out.println("dato ingresado no valido");   
        }
        System.out.println("La cantidad de alumnos en 1ro Primaria es: " + alumnos);
    }

}

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
public class Quinto implements Tablas{
    public int tabla;
    public int alumnos;
    Scanner sc = new Scanner(System.in);

    @Override
    public void tablas() {
        tabla = 9;
        System.out.println("TABLA DEL 9");
        for (int i = 0; i < 11; i++) {
            System.out.println(tabla + "*" + i + " = " + tabla * i);
        }
        System.out.println("TABLA DEL 10");
        tabla = 10;
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
        System.out.println("La cantidad de alumnos en 5to Primaria es: " + alumnos);
    }
    
}

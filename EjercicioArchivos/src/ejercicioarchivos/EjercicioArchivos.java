/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FileWriter - Crear un archivo en una ruta indicada y lo apertura
        FileWriter fw;
        //PrintWrite - Permite agregar información al archivo
        PrintWriter pw;
        Scanner sc = new Scanner(System.in);
        try {
            //Si se va ejecutar asegure de colocar la ruta donde quiere que se cree el Archivo
            fw = new FileWriter("C:\\Users\\John\\Desktop\\Prueba\\Ejercicio.txt", true);
            pw = new PrintWriter(fw);
            //lo que pide al principio
            pw.println("Nombre: Jonathan");
            System.out.println("Nombre: Jonathan");
            pw.println("Apellido: Herrera");
            System.out.println("Apellido: Herrera");
            pw.println("Ciudad: Guatemala");
            System.out.println("Ciudad: Guatemala");
            //inicio recorrido
            System.out.println("RECORRIDO DE 0 A 100");
            pw.println("RECORRIDO DE 0 A 100");
            for (int i = 0; i < 101; i++) {
                System.out.println("recorrido " + i);
                pw.println("recorrido " + i);
            }
            //fin recorrido
            //inicio del arreglo
            System.out.println("AREGLO DIMENCION 5");
            pw.println("ARREGLO DIMENCION 5");
            double[] arreglo = new double[5];
            double num;
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("ingrese el numero en la poscion " + i);
                num = sc.nextDouble();
                System.out.println(arreglo[i] = num);
                pw.println(arreglo[i] = num);
                arreglo[i] = num;
            }
            //fin del arreglo    
            //inicio matriz
            String[][] letras = new String[6][6];
            pw.println("MATRIZ 6X6");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.println("ingrese datos en la posicion " + i + " " + j);
                    //pw.println("ingrese datos en la posicion "+i+" "+j);
                    letras[i][j] = sc.next();
                }
            }
            System.out.println("MATRIZ");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("[" + letras[i][j] + "]");
                    pw.print("[" + letras[i][j] + "]");
                }
                System.out.println(" ");
                pw.println(" ");
            }
            //fin matriz
            fw.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        //Lectura de un archivo de texto
        //File - encuentra el archivo en la ruta indicada
        File archivo;
        //FileReader - valida el archivo y lo apertura
        FileReader fr;
        //BufferedReader - lee la información del archivo hasta encontrar vacío
        BufferedReader br;

        try {
            archivo = new File("C:\\Users\\John\\Desktop\\Prueba\\Ejercicio.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String lineas;
            while ((lineas = br.readLine()) != null) {
                System.out.println(lineas);
            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

}

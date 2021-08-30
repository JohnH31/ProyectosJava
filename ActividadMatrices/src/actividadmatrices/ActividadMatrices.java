/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadmatrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class ActividadMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        boolean salir = false;
        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 Ejercicio1");
            System.out.println("2 Ejercicio2");
            System.out.println("3 Salir");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    int a;
                    int b;
                    int sumaf = 0;
                    int sumac = 0;
                    String impri="";
                    String impri2="";
                    String impri3="";
                    System.out.println("Ingrese numero de Filas: ");
                    a = sc.nextInt();
                    System.out.println("Ingrese numero de Columnas: ");
                    b = sc.nextInt();
                    int[][] numeros = new int[a][b];
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.println("ingrese datos en la posicion " + i + " " + j);
                            numeros[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("--------------");
                    System.out.println("Matiz");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print(numeros[i][j] + " ");
                            impri += numeros[i][j];
                            impri += "";
                            //JOptionPane.showMessageDialog(null,numeros[i][j] + " ");
                        }
                        System.out.println(" ");
                        impri += "\n";
                    }
                    System.out.println("-------------------");
                    System.out.println("suma de filas");
                    //suma filas
                    for (int i = 0; i < a; i++) {
                        sumaf=0;
                        for (int j = 0; j < b; j++) {
                            sumaf += numeros[i][j];
                        }
                        System.out.println("la suma de la fila " + (i + 1) + " es: " + sumaf);
                        impri2 += sumaf;
                        impri2 += "\n";
                        //suma = suma + sumaf;
                    }
                    //JOptionPane.showMessageDialog(null,"la suma de la fila es: " + sumaf);
                    System.out.println(" ");
                    System.out.println("-------------------");
                    System.out.println("suma de columnas");
                    //suma columnas
                    for (int i = 0; i < b; i++) {
                        sumac=0;
                        for (int j = 0; j < a; j++) {
                            sumac += numeros[j][i];
                            
                        }
                        System.out.println("la suma de la columna " + (i + 1) + " es: " + sumac);
                        impri3 += sumac;
                        impri3 += "\n";
                        
                    }
                    System.out.println(" ");
                    //JOptionPane.showMessageDialog(null,"la suma de la fila es: " + sumaf);
                    JOptionPane.showMessageDialog(null,"Matriz: \n"+impri+" "+"\nFilas \n"+impri2+" "+"\nColumnas \n"+impri3);
                    break;
                case 2:
                    int c;
                    int d;
                    int e;
                    int f;
                    System.out.println("Ingrese los datos de los numeros de fila y columnas para las matrices");
                    System.out.println("MATRIS NUMERO 1");
                    System.out.println("Ingrese numero de Filas: ");
                    c = sc.nextInt();
                    System.out.println("Ingrese numero de Columnas: ");
                    d = sc.nextInt();
                    int[][] mat1 = new int[c][d];
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < d; j++) {
                            System.out.println("ingrese datos en la posicion " + i + " " + j);
                            mat1[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("--------------------");
                    System.out.println("MATRIS NUMERO 2");
                    System.out.println("Ingrese numero de Filas: ");
                    e = sc.nextInt();
                    System.out.println("Ingrese numero de Columnas: ");
                    f = sc.nextInt();
                    int[][] mat2 = new int[e][f];
                    for (int i = 0; i < e; i++) {
                        for (int j = 0; j < f; j++) {
                            System.out.println("ingrese datos en la posicion " + i + " " + j);
                            mat2[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("-----------------");
                    System.out.println("matris 1 ");
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < d; j++) {
                            System.out.print(mat1[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("-----------------");
                    System.out.println("matris 2");
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < d; j++) {
                            System.out.print(mat1[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("-----------------");
                    if(c==e && d==f){
                        System.out.println("matris 3");
                    int[][] mat3 = new int[c][d];
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < d; j++) {
                            mat3[i][j] = mat1[i][j] + mat2[i][j];
                        }
                     }
                    System.out.println("Matriz resultante de la suma :");
                        for (int i = 0; i <c; i++) {
                            for (int j = 0; j <d; j++) {
                                System.out.print(mat3[i][j] + " ");
                            }
                            System.out.println("");

                    }
                    }else{
                        System.out.println("Las matrices no son cuadradas para efectuar suma");
                    }
                    
                    break;
                case 3:
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatriz;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        //Matris Strim
//        System.out.println("Matriz Strim");
//        String [][] nombres = new String[4][4];
//        nombres [0][0] = "John";
//        nombres [0][1] = "Juan";
//        nombres [0][2] = "Jossy";
//        nombres [0][3] = "Josue";
//        //fila 2
//        nombres [1][0] = "Joaquin";
//        nombres [1][1] = "Jasmin";
//        nombres [1][2] = "Joel";
//        nombres [1][3] = "Jesus";
//        //fila 3
//        nombres [2][0] = "pedro";
//        nombres [2][1] = "adulfo";
//        nombres [2][2] = "claudia";
//        nombres [2][3] = "clara";
//        //fila 4
//        nombres [3][0] = "rosalia";
//        nombres [3][1] = "michael";
//        nombres [3][2] = "carlos";
//        nombres [3][3] = "erick";
//        System.out.println(nombres[3][3]);
//        System.out.println(nombres[2][2]);
//        System.out.println(nombres[1][1]);
//        char [][] letras = new char [5][3];
//        letras [0][0] = 'A';
//        letras [0][1] = 'B';
//        letras [0][2] = 'C';
//        //fila 2
//        letras [1][0] = 'D';
//        letras [1][1] = 'E';
//        letras [1][2] = 'F';
//        //fila 3
//        letras [2][0] = 'G';
//        letras [2][1] = 'H';
//        letras [2][2] = 'I';
//        //fila 4
//        letras [3][0] = 'J';
//        letras [3][1] = 'K';
//        letras [3][2] = 'L';
//        //fila 5
//        letras [4][0] = 'M';
//        letras [4][1] = 'N';
//        letras [4][2] = 'Ñ';
//        System.out.println(letras[1][1]);
//        System.out.println(letras[2][2]);
//        System.out.println(letras[4][2]);
//        int [][] numeros = new int[3][7];
//        numeros[0][0]=1;
//        numeros[0][1]=2;
//        numeros[0][2]=3;
//        numeros[0][3]=4;
//        numeros[0][4]=5;
//        numeros[0][5]=6;
//        numeros[0][6]=7;
//        //fila2
//        numeros[1][0]=8;
//        numeros[1][1]=9;
//        numeros[1][2]=10;
//        numeros[1][3]=11;
//        numeros[1][4]=12;
//        numeros[1][5]=13;
//        numeros[1][6]=14;
//        //fila3
//        numeros[2][0]=15;
//        numeros[2][1]=16;
//        numeros[2][2]=17;
//        numeros[2][3]=18;
//        numeros[2][4]=19;
//        numeros[2][5]=20;
//        numeros[2][6]=21;
//        System.out.println(numeros[0][4]);
//        System.out.println(numeros[1][4]);
//        System.out.println(numeros[2][4]);
        Scanner sc = new Scanner(System.in);
        char [][] letras = new char [6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("ingrese datos en la posicion "+i+" "+j);
                letras [i][j] = sc.next().charAt(0);
            }
        }
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(letras[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglo3;

/**
 *
 * @author John
 */
public class EjercicioArreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num [] = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int suma =0;
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
            suma = suma+num[i];    
        }
        System.out.println("La suma del arreglo es: "+ suma);
    }
    
}

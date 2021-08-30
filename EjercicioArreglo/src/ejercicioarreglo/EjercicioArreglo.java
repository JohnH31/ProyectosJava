/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglo;

/**
 *
 * @author John
 */
public class EjercicioArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = new int[5];
        short [] num2 = new short[5];
        float [] num3 = new float[5];
        int [] n = {10,20,30,40,50};
        short [] n2 = {6666,7777,8888,9999,10109};
        float [] n3 = {1111111111,222222222,333333333,444444444,555555555};
        num[0]=5;
        num[1]=6;
        num[2]=7;
        num[3]=8;
        num[4]=9;
        num2[0]=5000;
        num2[1]=6000;
        num2[2]=7000;
        num2[3]=8000;
        num2[4]=9000;
        num3[0]=500000000;
        num3[1]=600000000;
        num3[2]=700000000;
        num3[3]=800000000;
        num3[4]=900000000;
        System.out.println("INT");
        for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }
        System.out.println("SHORT");        
        for(int i=0;i<num2.length;i++){
            System.out.println(num2[i]);
        }
        System.out.println("FLOAT");
        for(int i=0;i<num3.length;i++){
            System.out.println(num3[i]);
        }
        System.out.println("INT");
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
        System.out.println("SHORT");        
        for(int i=0;i<n2.length;i++){
            System.out.println(n2[i]);
        }
        System.out.println("FLOAT");
        for(int i=0;i<n3.length;i++){
            System.out.println(n3[i]);
        }
    }
    
}

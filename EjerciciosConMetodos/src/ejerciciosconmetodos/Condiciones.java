/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconmetodos;

/**
 *
 * @author John
 */
public class Condiciones {
    public int n1;
    public int n2;
    public int n3;
    
    public Condiciones() {
        //vacio
    }
    //ejemplo if
    public int edad(){
        int edad;
        edad = n1;
        if(edad<18){
            System.out.println("Menor de Edad");
        }
        if(edad>=18){
            System.out.println("Mayor de Edad");
        }
        return edad;   
    }
    //If else
    public int parimpar(){
        int parimpar;
        parimpar = n1;
        if(parimpar%2==0){
            System.out.println("El numero es par");  
        }
        else{
            System.out.println("El numero es impar");
        }
        return parimpar;   
    }
    //if else if
    public String mayormenor(){
        int num1;
        int num2;
        int num3;
        num1=n1;
        num2=n2;
        num3=n3;
        if(num1>num2 && num2>num3){
            System.out.println("Ordenar Mayor a Menor "+num1+"-"+num2+"-"+num3);
        }
        else if(num1>num3 && num3>num2){
            System.out.println("Ordenar Mayor a Menor "+num1+"-"+num3+"-"+num2);
        }
        else if(num2>num1 && num1>num3){
            System.out.println("Ordenar Mayor a Menor "+num2+"-"+num1+"-"+num3);    
        }
        else if(num2>num3 && num3>num1){
            System.out.println("Ordenar Mayor a Menor "+num2+"-"+num3+"-"+num1);
        }
        else if(num3>num1 && num1>num2){
            System.out.println("Ordenar Mayor a Menor "+num3+"-"+num1+"-"+num2);
        }
        else if(num3>num2 && num2>num1){
            System.out.println("Ordenar Mayor a Menor "+num3+"-"+num2+"-"+num1);
        }
        else{
            System.out.println("numero no ingresado");
        }
        return "";   
    }
    //Switch
    public int mes(){
        int mes;
        mes = n1;
        switch (mes) 
        {
            case 1:  System.out.println("Enero");
                     break;
            case 2:  System.out.println("Febrero");
                     break;
            case 3:  System.out.println("Marzo");
                     break;
            case 4:  System.out.println("Abirl");
                     break;
            case 5:  System.out.println("Mayo");
                     break;
            case 6:  System.out.println("Junio");
                     break;
            case 7:  System.out.println("Julio");
                     break;
            case 8:  System.out.println("Agosto");
                     break;
            case 9:  System.out.println("Septiembre");
                     break;
            case 10:  System.out.println("Octubre");
                     break;
            case 11:  System.out.println("Noviembre");
                     break;
            case 12:  System.out.println("Diciembre");
                     break;         
            default: System.out.println("Mes no valido");
                     break;
        }
        return mes;   
    }
    
}

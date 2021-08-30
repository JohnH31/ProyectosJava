/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostring;

/**
 *
 * @author John
 */
public class EjercicioString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "Nombres";
        String ape = "Apellidos";
        String eda = "Edad";
        String gen = "Genero";
        String est = "Estudia";
        String auf = "Auto Favorito";
        String cof = "Color Favorito";
        String cmf = "Comida Favorita";
        System.out.println("ingrese sus "+nom+" y "+ape+" su "+eda+" y "+gen+" donde "+est+" cual es su "+auf+" su "+cof+" y su "+cmf);
        System.out.println(nom+ape+eda+gen+est+auf+cof+cmf);
        System.out.println(nom.toUpperCase()+ape.toUpperCase()+eda.toUpperCase()+gen.toUpperCase()+est.toUpperCase()+auf.toUpperCase()+cof.toUpperCase()+cmf.toUpperCase());
        System.out.println(nom.toLowerCase()+ape.toLowerCase()+eda.toLowerCase()+gen.toLowerCase()+est.toLowerCase()+auf.toLowerCase()+cof.toLowerCase()+cmf.toLowerCase());
    }
    
}

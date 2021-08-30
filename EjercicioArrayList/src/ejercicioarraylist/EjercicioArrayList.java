/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author John
 */
public class EjercicioArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("jonathan");
        nombre.add("joel");
        nombre.add("juares");
        nombre.add("yesica");
        nombre.add("carmen");
        nombre.add("ruben");
        nombre.add("jaqui");
        nombre.add("juan");
        nombre.add("pancho");
        nombre.add("pedro");
        for (int i = 0; i < nombre.size(); i++) {
            System.out.println(nombre.get(i));
        }
//        System.out.println(nombre.size());
//        System.out.println(nombre.get(3));
//        System.out.println(nombre.get(6));
//        System.out.println(nombre.get(9));
//        //System.out.println(nombre.contains(args));
//        System.out.println(nombre.remove(9));
//        nombre.add(9,"Ayala");
    }
    
}

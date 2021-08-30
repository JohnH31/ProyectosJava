/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ActividadArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numero = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        boolean salir = false;
        do {
            System.out.println("MENU ARREGLO: ");
            System.out.println("1 Agregar un elemento");
            System.out.println("2 buscar un elemento");
            System.out.println("3 modificar un elemento");
            System.out.println("4 eliminar un elemento por posicion");
            System.out.println("5 insertar un elemento por posicion");
            System.out.println("6 mostrar todos los elementos");
            System.out.println("7 Salir");
            System.out.print("Elegir una Opcion: ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Agregue un numero: ");
                    int elemento;
                    elemento = sc.nextInt();
                    numero.add(elemento);
                    System.out.println("*-----------------*");
                    break;
                case 2:
                    System.out.println("inserte el numero a buscar ");
                    int busqueda;
                    busqueda = sc.nextInt();
                    boolean existe = numero.contains(busqueda);
                    if (existe) {
                        System.out.println("El elemento SI existe en la lista");
                        System.out.println("numero encontrado " + busqueda);
                    } else {
                        System.out.println("El elemento no existe");
                    }
                    System.out.println("*------------------------*");
                    break;
                case 3:
                    int posicion4 = 0;
                    System.out.println("*--------------------------*");
                    System.out.println("mi Arreglo: ");
                    for (int i = 0; i < numero.size(); i++) {
                        System.out.print("Posicion" + posicion4 + ":" + numero.get(i) + "\n");
                        posicion4++;
                    }
                    System.out.println("*--------------------------*");
                    System.out.println("posicion a modificar ");
                    int modi;
                    modi = sc.nextInt();
                    if (modi < numero.size()) {
                        System.out.println("ingrese numero para modificar posicion ");
                        int num2;
                        num2 = sc.nextInt();
                        numero.set(modi, num2);
                        System.out.println("numero modificado");
                        System.out.println("el numero " + num2 + " fue modificado en la posicion " + modi);
                        int posicion5 = 0;
                        System.out.println("*--------------------------*");
                        System.out.println("mi Arreglo: ");
                        for (int i = 0; i < numero.size(); i++) {
                            System.out.print("Posicion" + posicion5 + ":" + numero.get(i) + "\n");
                            posicion5++;
                        }
                        System.out.println("*--------------------------*");
                    } else {
                        System.out.println("posicion no encontrada");
                    }
                    System.out.println("*-------------------*");
                    break;
                case 4:
                    System.out.println("Ingrese el numero de la posicion a eliminar");
                    int eli;
                    eli = sc.nextInt();
                    if (eli < numero.size()) {
                        System.out.println("numero eliminado " + numero.remove(eli));
                    } else {
                        System.out.println("posicion elegida no existente");
                    }
                    System.out.println("*-----------------*");

                    break;
                case 5:
                    int posicion2 = 0;
                    System.out.println("*--------------------------*");
                    System.out.println("mi Arreglo: ");
                    for (int i = 0; i < numero.size(); i++) {
                        System.out.print("Posicion" + posicion2 + ":" + numero.get(i) + "\n");
                        posicion2++;
                    }
                    System.out.println("*--------------------------*");
                    System.out.println("ingrese el numero en la posicion a colocar");
                    int pos;
                    pos = sc.nextInt();
                    if (pos < numero.size()) {
                        System.out.println("ingrese el numero a colocar ");
                        int in;
                        in = sc.nextInt();
                        numero.add(pos, in);
                        System.out.println("numero insertado");
                        System.out.println("el numero " + in + " en la posicion " + pos);
                        int posicion3 = 0;
                        System.out.println("*--------------------------*");
                        System.out.println("mi Arreglo: ");
                        for (int i = 0; i < numero.size(); i++) {
                            System.out.print("Posicion" + posicion3 + ":" + numero.get(i) + "\n");
                            posicion3++;
                        }
                        System.out.println("*--------------------------*");
                    } else {
                        System.out.println("posicion no encontrada ");
                    }
                    System.out.println("*----------------------*");
                    break;
                case 6:
                    int posicion = 0;
                    System.out.println("*--------------------------*");
                    System.out.println("mi Arreglo: ");
                    for (int i = 0; i < numero.size(); i++) {
                        System.out.print("Posicion" + posicion + ":" + numero.get(i) + "\n");
                        posicion++;
                    }
                    System.out.println("*--------------------------*");
                    break;
                case 7:
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

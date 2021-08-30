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
class Operaciones {

    public double n1;
    public double n2;

    public Operaciones() {
        //vacio
    }

    //suma
    public int suma() {
        int suma;
        suma = (int) (n1 + n2);
        return suma;
    }

    //resta
    public int resta() {
        int resta;
        resta = (int) (n1 - n2);
        return resta;
    }

    //multiplicacion
    public int multi() {
        int multi;
        multi = (int) (n1 * n2);
        return multi;
    }

    //divicion
    public double divi() {
        double divi;
        divi = n1 / n2;
        return divi;
    }
}

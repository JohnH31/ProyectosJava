/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author John
 */
public class ModeloLogica {

    public ModeloLogica() {

    }
    private int n1;
    private int n2;
    private double n11;
    private double n12;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //Logica funcional
    //suma
    public int suma() {
        int suma;
        suma = this.n1 + this.n2;
        return suma;
    }

    //resta
    public int resta() {
        int resta;
        resta = this.n1 - this.n2;
        return resta;
    }
    //multiplicacion

    public int multi() {
        int multi;
        multi = this.n1 * this.n2;
        return multi;
    }

    public double getN11() {
        return n11;
    }

    public void setN11(double n11) {
        this.n11 = n11;
    }

    public double getN12() {
        return n12;
    }

    public void setN12(double n12) {
        this.n12 = n12;
    }

    //divicion
    public double divicion() {
        double divicion;
        divicion = this.n11 / this.n12;
        return divicion;
    }
}

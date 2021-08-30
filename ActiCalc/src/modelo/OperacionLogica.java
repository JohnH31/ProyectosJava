/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.Calculadora;

/**
 *
 * @author Usuario
 */
public class OperacionLogica {

    public OperacionLogica() {
        //vacio
    }
    private int n1;
    private int n2;
    private String palabra;
    private String palabra2;
    FileOutputStream salida;
    File archivo;

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

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    //suma
    private int suma() {
        int suma;
        suma = this.n1 + this.n2;
        return suma;
    }

    //resta
    private int resta() {
        int resta;
        resta = this.n1 - this.n2;
        return resta;
    }

    //multiplicacion
    private int multi() {
        int multi;
        multi = this.n1 * this.n2;
        return multi;
    }

    //divicion
    private int divi() {
        int divi;
        divi = this.n1 / this.n2;
        return divi;
    }
    
    //Modulo/Resto
    private int moduloResto(){
        int resto;
        resto = this.n1 % this.n2;
        return resto;
    }
    
    //Potencia
    private int potencia(){
        int potencia;
        potencia = (int) Math.pow(this.n1,this.n2);
        return potencia;
    }

    public int Palabras() {
        int Resultado = 0;
        switch (palabra) {
            case "Sumar":
                Resultado = suma();
                break;
            case "Restar":
                Resultado = resta();
                break;
            case "Multiplicar":
                Resultado = multi();
                break;
            case "Dividir":
                Resultado = divi();
                break;
            case "Modulo/Resto":
                Resultado = moduloResto();
                break;
            case "Potencia":
                Resultado = potencia();
                break;
                case "ValorAbsoluto":
                Math.abs(suma());
                break;
            default:
                break;
        }
        return Resultado;
    }
    Calculadora calc = new Calculadora();
        public int PalabrasExtras() {
        int Resultado = 0;
        switch (palabra2) {
            case "ValorAbsoluto":
                String contenido = calc.jtaTexto.getText();
                Math.abs(Integer.parseInt(contenido));
                break;
            case "Restar":
                Resultado = resta();
                break;
            case "Multiplicar":
                Resultado = multi();
                break;
            case "Dividir":
                Resultado = divi();
                break;
            case "Modulo/Resto":
                Resultado = moduloResto();
                break;
            case "Potencia":
                Resultado = potencia();
                break;
            default:
                break;
        }
        return Resultado;
    }

    public String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
     public String GuardarTexto(File archivo, String contenido){
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] btxt = contenido.getBytes();
            salida.write(btxt);
            respuesta = "Guardado con exito";
        } catch (Exception e) {

        }
        return respuesta;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

}

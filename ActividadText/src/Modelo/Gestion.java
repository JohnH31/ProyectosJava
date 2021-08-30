/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author John
 */
public class Gestion {

    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public Gestion() {

    }

    public String AbrirTexto(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int accion;
            while ((accion = entrada.read()) != -1) {
                char caracter = (char) accion;
                contenido += caracter;
            }
        } catch (Exception e) {

        }
        return contenido;
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
}

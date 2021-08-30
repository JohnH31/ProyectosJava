/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadabstracto;

/**
 *
 * @author John
 */
public abstract class Trabajadores {
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public int sueldo;
    
    public int sueldot(){
        int sueldot;
        sueldot = sueldo * 12;
        return sueldot;
    }
    public abstract int comicion();
    
}

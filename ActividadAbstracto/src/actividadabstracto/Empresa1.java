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
public class Empresa1 extends Trabajadores {

    @Override
    public int comicion() {
        int comicion;
        comicion = sueldo + 1500;
        return comicion;
    }
    
}

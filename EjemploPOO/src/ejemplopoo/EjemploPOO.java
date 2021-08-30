/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopoo;

/**
 *
 * @author John
 */
public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo sedan = new Vehiculo();
        sedan.marca = "Mazda";
        sedan.pasajeros = 5;
        sedan.velocidad =200;
        System.out.println("Marca: "+sedan.marca+" Pasajeros: "+sedan.pasajeros+" Velocidad: "+sedan.velocidad);
        sedan.arranca();
        sedan.apagar();
        System.out.println("+_________________________+");
        Vehiculo pickup = new Vehiculo();
        pickup.marca = "Toyota";
        pickup.pasajeros = 2;
        pickup.velocidad =150;
        System.out.println("Marca: "+pickup.marca+" Pasajeros: "+pickup.pasajeros+" Velocidad: "+pickup.velocidad);
        pickup.arranca();
        pickup.apagar();
        
    }
    
}

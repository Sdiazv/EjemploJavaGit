/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Stephanie
 */
import automovil.Automovil;

public class ApIAutomovil {
    
    
    public static void main (String[] args) {
        Automovil carrito = new Automovil("Mario Gomez", "88888888", "Ferrari", "Rojo");
        Automovil carrito2 = new Automovil("Helda Garro", "87777777", "Hyundai", "Negro");
        carrito.cambiarColor("Negro");
        carrito.cambiarDuenio("Marta Pasos", "89890090");
        carrito.repararAutomovil();
        System.out.println(carrito.toString());
        carrito2.chocarAutomovil();
        carrito2.cambiarDuenio("Isma López", "60009000");
        System.out.println(carrito2.toString());
        carrito2.repararAutomovil();
        carrito2.cambiarDuenio("Cecilia Montes", "89990000");
        System.out.println(carrito2.toString());
        carrito.cambiarColor("Negro");
        carrito2.cambiarColor("Azul");
        System.out.println(carrito.toString());
        System.out.println(carrito2.toString());
    }    
    
}

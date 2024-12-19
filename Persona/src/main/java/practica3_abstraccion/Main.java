/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_abstraccion;

/**
 *
 * @author sistemas03
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("TOYOTA", "YARIS");
        Moto moto = new Moto("HONDA", "CRB200");
        
        coche.detalles();
        
        moto.detalles();
    }
}

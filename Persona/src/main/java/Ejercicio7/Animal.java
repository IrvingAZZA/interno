/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author sistemas03
 */
public abstract class Animal {
     String nombre;
    
    public void Nombre(String nombre)
    {
       this.nombre = nombre;
    }
    public abstract void hacerSonido();
    public void Probar()
    {
        System.out.println("el animas es: "+nombre);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_abstraccion;

/**
 *
 * @author sistemas03
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    public abstract void encender();
  
    public abstract void apagar();
    
    public void detalles()
    {
        System.out.println("la marca es: " + marca + " y el modelo es: "+ modelo);
    }

}

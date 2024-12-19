/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author sistemas03
 */

public class Persona
{
    String nombre;
    int edad;
    String ocupacion;
    
    public Persona()
    {
        nombre = "sin nombre";
        edad = 0;
        ocupacion = "Desempleado";
    }
    public Persona(String nombre, int edad, String ocupacion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }
    public void MostrarInfo()
    {
        System.out.println("el nombre es :" + nombre + " la edad es: "+ edad + " la ocupacion es: "+ ocupacion);
    }
    
    public static void main (String[] args)
    {
        Persona persona1 = new Persona();
        persona1.MostrarInfo();
        
        Persona persona2 = new Persona("Irving",32,"insgeniero");
        persona2.MostrarInfo();
        
        Persona persona3 = new Persona("Sharon", 27, "Periodista");
        persona3.MostrarInfo();
    }
}

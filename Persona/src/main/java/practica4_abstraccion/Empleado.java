/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_abstraccion;

/**
 *
 * @author sistemas03
 */
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase)
    {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public double getSalarioBase()
    {
        return salarioBase;
    }
    
    public abstract double calcularSalario();
    
    public void MostrarInformacion()
    {
        System.out.println("El empleado es: " + nombre);
        System.out.println("El Salario es: " + calcularSalario());
        
        
    }
}

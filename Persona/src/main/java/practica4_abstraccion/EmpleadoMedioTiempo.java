/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_abstraccion;

/**
 *
 * @author sistemas03
 */
public class EmpleadoMedioTiempo extends Empleado{

    public EmpleadoMedioTiempo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5;
    }
    
}

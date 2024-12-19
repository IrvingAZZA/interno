/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_abstraccion;

/**
 *
 * @author sistemas03
 */
public class Main {
    public static void main(String[] args) {
    Empleado[] empleados = new Empleado[4];
        
        empleados[0] = new EmpleadoTiempoCompleto("Irving", 2500);
        empleados[1] = new EmpleadoMedioTiempo("Jose", 3000);
        empleados[2] = new EmpleadoTiempoCompleto("Maria Paz", 1500);
        empleados[3] = new EmpleadoMedioTiempo("Sharon", 4000);
           
        for (Empleado empleado : empleados)
        {
            empleado.MostrarInformacion();
        }
    }
}

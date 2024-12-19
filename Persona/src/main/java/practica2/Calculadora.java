/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author sistemas03
 */
public class Calculadora implements Operaciones{
    private int a;
    private int b;
    public Calculadora(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sumar() {
       return a + b;
    }

    @Override
    public int restar() {
       return a - b;
    }

    @Override
    public int multiplicar() {
       return a * b;
    }

    @Override
    public double dividir() {
       return a / b;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

public class Main {
    public static void main(String[] args) {
        Operaciones numero1 = new Calculadora(5, 6);
        System.out.println("la suma es: " + numero1.sumar());
        System.out.println("la resta es: " + numero1.restar());
        System.out.println("la multiplicacion es: "+ numero1.multiplicar());
        System.out.println("la division es: "+numero1.dividir());
        
        Operaciones numero2 = new Calculadora(8, 9);
        System.out.println("la suma es: " + numero2.sumar());
        System.out.println("la resta es: " + numero2.restar());
        System.out.println("la multiplicacion es: "+ numero2.multiplicar());
        System.out.println("la division es: "+numero2.dividir());
    }
}

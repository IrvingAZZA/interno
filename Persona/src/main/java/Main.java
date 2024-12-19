


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sistemas03
 */
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

        Figura cuadrado = new Cuadrado(4);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());
    }
}

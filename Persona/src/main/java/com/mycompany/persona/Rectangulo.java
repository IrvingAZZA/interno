/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author sistemas03
 */
public class Rectangulo {
    double ancho;
    double alto;
    double area;
    public Rectangulo()
    {
        ancho = 0;
        alto = 0;
    }
    public Rectangulo(double ancho, double alto)
    {
        this.alto = alto;
        this.ancho = ancho;
    }
    public void calcularArea()
    {
        area = alto * ancho;
        System.out.println("el alto es: " + alto + " el ancho es : " + ancho + " y el resultado es :" + area);
    }
        public static void main (String[] args)
    {
        Rectangulo rectangulo1 = new Rectangulo(15, 3);
        rectangulo1.calcularArea();
        
        Rectangulo rectangulo2 = new Rectangulo(2.6, 8);
        rectangulo2.calcularArea();
    }

}

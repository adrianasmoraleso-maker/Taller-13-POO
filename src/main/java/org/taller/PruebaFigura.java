package org.taller;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 3);
        Figura triangulo = new Triangulo(4, 6);

        System.out.println("\n--------------Calcular Áreas Figuras--------------\n");

        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}
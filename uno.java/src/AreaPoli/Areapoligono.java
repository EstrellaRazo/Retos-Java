package AreaPoli;

public class Areapoligono {
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
    public static double calcularArea(Poligono poligono) {
        return poligono.calcularArea();
    }
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3.4, 2.3);
        Rectangulo rectangulo = new Rectangulo(43.1, 80.56);
        Cuadrado cuadrado = new Cuadrado(3);

        System.out.println(String.format("Área triángulo: %.2f" , calcularArea(triangulo)));
        System.out.println(String.format("Área rectángulo: %.2f" , calcularArea(rectangulo)));
        System.out.println(String.format("Área cuadrado: %.2f" , calcularArea(cuadrado)));
    }
}
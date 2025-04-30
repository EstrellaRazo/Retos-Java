package AreaPoli;

public class Cuadrado extends Poligono{
    double lado;

    Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}

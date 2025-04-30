package AreaPoli;

public class Triangulo extends Poligono{
    double base;
    double altura;

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura/2;
    }
}

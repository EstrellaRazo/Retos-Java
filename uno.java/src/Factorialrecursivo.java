public class Factorialrecursivo {
    /*
    * Escribe una función que calcule y retorne el factorial de un número dado
    * de forma recursiva.
    */

    public static long factorial(int numero){
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        if (numero == 1) { //Factorial de 1 es igual a 1 y se detiene la recursión
            return 1;
        }
        return numero * factorial(numero-1);
    }
    public static void main(String[] args) {
        int numero = 7;
        long factorial = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

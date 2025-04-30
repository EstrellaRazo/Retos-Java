import java.util.Scanner;

public class Decimalabinario {
     /*
        * Crea un programa se encargue de transformar un número
        * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
        */
    public static String convertir(int numeroDecimal){
        int numero = numeroDecimal;
        String binario = "";

        if(numero == 0) {
            binario = "0";
        }
        while(numero > 0){
            int residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }
        return binario;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        System.out.println("El número " + numeroDecimal + " 12binario es: " + convertir(numeroDecimal));
    }
}

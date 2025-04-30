import java.lang.reflect.Array;

public class Revertircadenas {
    /*
    * Crea un programa que invierta el orden de una cadena de texto
    * sin usar funciones propias del lenguaje que lo hagan de forma automática.
    * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
    */
    public static String revertirCadena(String cadena){
        String reversa = "";

        for(int i = cadena.length() - 1; i >= 0; i--){
            reversa += cadena.charAt(i);
        }
        return reversa;
    }

    public static void main(String[] args) {
        String revertida = revertirCadena("Esta es la frase");
        System.out.println("Frase en reversa: " + revertida);
    }
}

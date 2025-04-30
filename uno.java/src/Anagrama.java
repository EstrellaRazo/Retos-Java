import java.util.Arrays;

public class Anagrama {

    /*
    * Escribe una función que reciba dos palabras (String) y retorne
    * verdadero o falso (Bool) según sean o no anagramas.
    * - Un Anagrama consiste en formar una palabra reordenando TODAS
    *   las letras de otra palabra inicial.
    * - NO hace falta comprobar que ambas palabras existan.
    * - Dos palabras exactamente iguales no son anagrama.
    */
    public static boolean isAnagram(String palabra1, String palabra2){
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if(palabra1.equals(palabra2)){
            return false;
        }

        char[] word1 = palabra1.toCharArray();
        char[] word2 = palabra2.toCharArray();
        
        Arrays.sort(word1);
        Arrays.sort(word2);
        if(Arrays.equals(word1, word2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("amor", "Roma"));
        System.out.println(isAnagram("Aloh", "Hola"));
        System.out.println(isAnagram("Tocar", "Roca"));
    }
}

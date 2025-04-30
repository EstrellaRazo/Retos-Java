import java.util.HashMap;
import java.util.Map;

public class Contadorpalabras {
    /*
    * Crea un programa que cuente cuantas veces se repite cada palabra
    * y que muestre el recuento final de todas ellas.
    * - Los signos de puntuación no forman parte de la palabra.
    * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
    * - No se pueden utilizar funciones propias del lenguaje que
    *   lo resuelvan automáticamente.
    */
    public static void contar(String frase){
        
        Map<String, Integer> palabras = new HashMap<String, Integer>();
        StringBuilder palabra = new StringBuilder();

        for(int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            
            if(Character.isLetter(caracter)){
                palabra.append(caracter);
            }else if(palabra.length() > 0){
                String palabraFinal = palabra.toString().toLowerCase();
                System.out.println("Palabra: " + palabraFinal);
                if(palabras.containsKey(palabraFinal)){
                    palabras.put(palabraFinal, palabras.get(palabraFinal)+1); //get obtiene el value del hashmap
                } else{
                    palabras.put(palabraFinal, 1);
                }
                palabra.setLength(0); 
            }
        }

        if(palabra.length() > 0){
            String palabraFinal = palabra.toString().toLowerCase();
            if(palabras.containsKey(palabraFinal)){
                palabras.put(palabraFinal, palabras.get(palabraFinal)+1);
            } else{
                palabras.put(palabraFinal, 1);
            }
        }
        /* 
        Map<String, Integer> palabras = new HashMap<>();
        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (Character.isLetter(caracter)) { 
                palabra.append(caracter); // Agregar letra a la palabra
            } else if (palabra.length() > 0) { // Se encontró un delimitador (espacio, puntuación, etc.)
                String palabraFinal = palabra.toString().toLowerCase(); // Convertir a minúsculas para evitar duplicados
                palabras.put(palabraFinal, palabras.getOrDefault(palabraFinal, 0) + 1);
                palabra.setLength(0); // Reiniciar palabra para la siguiente
            }
        }
        
        // Agregar la última palabra si el string no termina en espacio
        if (palabra.length() > 0) {
            String palabraFinal = palabra.toString().toLowerCase();
            palabras.put(palabraFinal, palabras.getOrDefault(palabraFinal, 0) + 1);
        }
        */ 
        
        //Imprimir el MAP
        palabras.forEach((key, value) -> System.out.println("[Palabra] : " + key + " [Apariciones] : " + value));
    }

    public static void main(String[] args) {
        contar("Hola hola hola oki Hola! esta es otra palabra. hola a todos, otra vez");
    }
}

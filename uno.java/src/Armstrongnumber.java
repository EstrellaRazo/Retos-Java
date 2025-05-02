
public class Armstrongnumber {
    public static boolean numArmstrong(String num){
        int result = 0;
        int potencia = num.length();

        for(int i=0; i<=(num.length()-1); i++){
            int entero = Integer.parseInt(Character.toString(num.charAt(i)));
            result += Math.pow(entero, potencia);
        }

        int numero = Integer.valueOf(num);

        if(result == numero){ return true;}

        return false;
    }
    public static void main(String[] args) {
        String numero = "1634";
        System.out.println("El número " + numero + " es número de armstrong: " + numArmstrong(numero));
    }
}

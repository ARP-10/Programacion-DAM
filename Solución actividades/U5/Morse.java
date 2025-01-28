/**
 * Crea una función con la siguiente cabecera: 
 *
 * public static String convierteEnMorse(int n) 
 *
 * Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. 
 * Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse. 
 * Utiliza esta función en un programa para comprobar que funciona bien. 
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. 
 */
public class Morse {
    public static void main(String[] args) {
        int[] numeros = {213, 0, 110, 24, 86};
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print("El " + numeros[i] + " es el " + convierteEnMorse(numeros[i]) + " en morse. \n"); 
        } 
    }
    public static String convierteEnMorse(int n) { 
        String[] morse = {
              "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
          ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."};
        String resultado = "";
        do {
            resultado = morse[n%10] + resultado;
            n = n/10;
        } while (n >0);
        return resultado; 
    }
}
        


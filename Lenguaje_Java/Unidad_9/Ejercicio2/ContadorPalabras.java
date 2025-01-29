package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;

public class ContadorPalabras {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("programacion");
        palabras.add("hola");
        palabras.add("Hola");
        palabras.add("programacion");
        palabras.add("java");
        palabras.add("UEM");
        palabras.add("Hola");
        palabras.add("Hola");
        palabras.add("programacion");
        palabras.add("java");
        palabras.add("java");

        HashMap<String, Integer> contador = new HashMap<>();
        /*HashMap almacenara esto:
         * ("programacion", 3)
         * ("hola", 1)
         * ("Hola", 3)
         * ("java", 3)
         * ("UEM", 1)
        */

        for (int i=0; i<palabras.size(); i++) {
            if (contador.containsKey(palabras.get(i))) { //=> palabras.get(0) = "programacion" en la primera vuelta
                // al valor .put hay que pasarle (clave, valor)
                contador.put(palabras.get(i), contador.get(palabras.get(i)) + 1);
            } else {
                contador.put(palabras.get(i), 1);
            }
        } //En la parte del if, recoge en caso de que la clave tenga mas de un valor, le anade1 y el else, en caso de que no haya una clave igual antes, le pone un 1

        System.out.println(contador);
    }
}

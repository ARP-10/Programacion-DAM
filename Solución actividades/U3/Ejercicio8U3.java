import java.util.Scanner;

public class Ejercicio8U3 {
    /*
     * Escribir un programa en Java que calcule si un determinado número que se pasa por teclado es primo.
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = teclado.nextInt();
        int contador = 0;
        for (int i = 2; i < num; i++){ // Comprobaremos las divisiones entre todos los valores hasta él mismo (sin incluir el 1 y él mismo).
            if (num % i == 0){ 
              contador++; //Si el módulo del número es igual a 0 quiere decir que el número es divisible por un valor distinto a 1 y sí mismo -> no primo
            } 
        } 
        if (contador == 0){ // Un número primo solo puede ser dividido por él mismo y por 1.
          System.out.println("El número " + num + " es primo.");
        } else {
          System.out.println("El número " + num + " NO es primo.");
        }  
        teclado.close();
    }
}

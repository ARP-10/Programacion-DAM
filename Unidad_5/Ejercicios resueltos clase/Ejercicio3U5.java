

import java.util.Scanner;

public class Ejercicio3U5 {
    /*
     * Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado.
     * Crea un método donde pasamos como parámetros entre que números queremos que los genere, podemos pedirlas por teclado antes de generar los números. 
     * Este método devolverá un número entero aleatorio. Muestra los números por pantalla.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números aleatorios que quieres: ");
        int cantidad = teclado.nextInt();
        System.out.println("Introduce el valor mínimo del número aleatorio: ");
        int min = teclado.nextInt();
        System.out.println("Introduce el valor máximo del número aleatorio");
        int max = teclado.nextInt();
        System.out.println("Los números generados son: ");
        for(int i=0;i<cantidad;i++){
            System.out.println(generaNumero(min, max));
        }
        teclado.close();
    }
    public static int generaNumero(int minimo, int maximo){
        return ((int)Math.floor(Math.random()*(maximo + 1 - minimo) + minimo));
    }
}


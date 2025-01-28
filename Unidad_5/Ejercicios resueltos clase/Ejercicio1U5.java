

import java.util.Scanner;

public class Ejercicio1U5 {
    /*
     * Escribir una función que realice la potencia de 2 números dados por el usuario, siendo uno la base y otro el exponente. 
     * Utilizar esta función para mostrar los cuadrados de los números del 1 al 10.
     */
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        System.out.println("El resultado de " + base + "^" + exponente + " es: " + potencia(base, exponente));

        System.out.println("Cuadrados de los números del 1 al 10: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(potencia(i, 2));
        }
        teclado.close();
    }

    public static int potencia(int b, int e){
        int solucion = 1;
        if (b == 0){
            System.out.println("No se puede realizar una potencia con base 0");
        }
        for(int i = 1; i<= e; i++){
            solucion = solucion*b;
        }
        return solucion;
    }
}

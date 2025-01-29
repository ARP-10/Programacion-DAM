import java.util.Scanner;

public class Ejercicio5U3{
    /*
     * Escribir un programa en Java en el que pida al usuario la inserción de números hasta que inserte un 0. 
     * Una vez terminado, mostrar en orden los números insertados por el usuario.
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número. Introduce 0 para finalizar:");
        String numeroIntroducido = teclado.nextLine();
        String cadenaNumeros = "";

        while (Double.parseDouble(numeroIntroducido) != 0){
            cadenaNumeros = cadenaNumeros + " " + numeroIntroducido;
            numeroIntroducido = teclado.nextLine();
        }

        System.out.println("Los números que has introducido son: " + cadenaNumeros);

        // ¿Podemos hacerlo con arrays? NO ÓPTIMO, tenemos que indicar al declarar el array su tamaño pero no lo sabemos a priori.
        // Lo hacemos para repasar el uso de arrays.
        System.out.println("Introduce un número. Introduce 0 para finalizar:");
        double numeroIntroducido2 = teclado.nextDouble();
        double[] numerosIntroducidos = new double[50];
        // La otra forma de crear un array, solo si sabemos sus valores: double[] array = {1,2,3,4,5,6,7};
        int indice = 0;

        while (numeroIntroducido2 != 0){
            numerosIntroducidos[indice] = numeroIntroducido2;
            numeroIntroducido2 = teclado.nextDouble();
            indice++;
        }
        
        System.out.println("Los números introducidos son:");

        for (int i = 0; i<numerosIntroducidos.length; i++){
            // Modificar para que la longitud sea únicamente 
            // hasta el índice anterior para no sacar los no rellenados
            // for (int i = 0; i<indice; i++)
            System.out.println(numerosIntroducidos[i]);
        }

        teclado.close();
    }
    
}
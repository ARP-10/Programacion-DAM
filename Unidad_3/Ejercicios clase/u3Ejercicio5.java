import java.util.Scanner;

public class u3Ejercicio5 {

    public static void main(String[] args){

        /*Escribir un programa en Java en el que pida al usuario la inserción de números hasta que inserte un 0. 
        Una vez terminado, mostrar en orden los números insertados por el usuario*/
        
        // Este ejercicio sería mejor completarlo con listas, pero aún no las hemos dado

        //Se puede hacer un poco más complejo si una vez insertados números y cuando el usuario inserta un 0, el programa ordena los números

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número. Pulsa 0 para terminar");
        String numeroIntroducido = teclado.nextLine(); //El nextLine solo ocupa de memoria los caracteres que insertamos sería lo mismo que poner solo next
        String cadenaNumeros = ""; //Int defecto ->, String -> null

        while (Integer.parseInt(numeroIntroducido) != 0) {
            cadenaNumeros = cadenaNumeros + numeroIntroducido + " " ;
            numeroIntroducido = teclado.nextLine();
        }

        System.out.println("Los números introducidos por el usuario son " + cadenaNumeros);  

        
        /*
        // (añadido por la profe) ¿Se puede hacer esto allmacenando en un array?
        // no es la forma óptima de hacer el ejercicio, es solo para practicar los arrays
        int [] numeroIntroducido = new int [50];
        System.out.println("Introduce un número. Pulsa 0 para terminar.");

        int numeroIntroducido = teclado.nextInt();

        while (numeroIntroducido !=0){
            numeroIntroducido
        }
        */

        teclado.close();  

    }
    
}
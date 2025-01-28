import java.util.Scanner;

public class u3Ejercicio6 {

    public static void main(String[] args){

        /*Escribir un programa en Java que dado un número por teclado, escriba “El número es válido” si: 
            a. El número se encuentra entre 1000 y 10000 
            b. El número no es divisible por 5 ni termina en 0 En caso contrario, el texto debe ser “El número NO es válido”.  */

        Scanner teclado = new Scanner(System.in);

        int numval;

        System.out.println("Escribe un número: ");
        numval = teclado.nextInt();

        if(numval >= 1000 && numval <= 10000 && numval / 5 != 0){
            System.out.println("El número es válido");
        } else {
            System.out.println("El número no es válido");
        }
        
        //Me he atascado en cómo hacer que el programa sepa si el número temina en "0"


        teclado.close();
    }
    
}
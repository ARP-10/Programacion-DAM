import java.util.Scanner;

public class Ejercicio6U3 {
    /*
     * Escribir un programa en Java que dado un número por teclado, escriba “El número es válido” si: 
        a. El número se encuentra entre 1000 y 10000 
        b. El número no es divisible por 5 ni termina en 0 
       En caso contrario, el texto debe ser “El número NO es válido”.   
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = teclado.nextInt();

        if ((num > 1000) && (num < 10000) && (num % 5 != 0) && (num % 10 != 0)){ // num % 10 nos da la última cifra de num
            System.out.println("El número " + num + " es válido.");
        } else{
            System.out.println("El número " + num + " NO es válido.");
        }
        teclado.close();
    }
}

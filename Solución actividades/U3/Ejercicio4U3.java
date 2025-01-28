import java.util.Scanner;

public class Ejercicio4U3 {
    /*
     * Dado un número, realiza un programa que indique por pantalla en una frase sus propiedades, las cuales pueden ser:
        a) Par o impar. 
        b) Positivo o negativo. 
        c) Entero o decimal. 
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        double num = teclado.nextDouble();
        String cadena = ""; // Nos pide en una frase, iremos concatenando las propiedades en esta cadena.

        if (num % 1 !=0){
            cadena = "El número " + num + " es decimal por tanto no es par ni impar y ";
        } else{
            if (num % 2 == 0){
                cadena = "El número " + num + " es entero par y ";
            } else{
                cadena = "El número " + num + " es entero impar y ";
            }
        }
        if (num >= 0){
            cadena = cadena + "es positivo.";
        } else {
            cadena = cadena + "es negativo.";
        }
        System.out.println(cadena);
        teclado.close();
    }
}

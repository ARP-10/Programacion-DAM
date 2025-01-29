import java.util.Scanner;

public class Ejercicio2U3 {
    /*
     * Escribir por pantalla los números incrementando desde 1 hasta que la suma de todos esos números sea mayor 
     * a una variable entera x. 
     * Ejemplos:

        X = 10; 1, 2, 3, 4, 5 -> 1+2+3+4+5 = 15 

        X = 25; 1, 2, 3, 4, 5, 6, 7 -> 1+2+3+4+5+6+7 = 28 

     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); // También podemos declarar directamente x con el valor que queramos
        System.out.print("Introduzca el valor de x: "); // int x = 10;
        int x = teclado.nextInt();
        int num = 1;
        int suma = 0;
        String cadena = "";
        while (suma <= x){
            cadena = cadena + Integer.toString(num);
            suma=suma+num;  
            num++; 
            if (suma <= x){
                cadena = cadena + " + ";
            } else {
                cadena = cadena + " = ";
            }
        } 
        System.out.println(cadena + suma);
        teclado.close();
    }
}

import java.util.Scanner;

public class u3Ejercicio2 {

    public static void main(String[] args){

        //Escribir por pantalla los números incrementando desde 1 hasta que la suma de todos esos números sea mayor a una variable entera x

        Scanner teclado = new Scanner (System.in);

        System.out.println("Escribe un número positivo mayor que 0: ");
        
        int variableEntera = teclado.nextInt();

        int suma = 0;

        for (int a = 0; a <= variableEntera; a++){
            suma = suma + a;
        }

        System.out.println("El resultado es: " + suma);

        
        teclado.close();


        
    }
    
}

import java.util.Scanner;

public class u3Ejercicio4 {

    public static void main(String[] args){

    /*Dado un número, realiza un programa que indique por pantalla en una frase sus propiedades, las cuales pueden ser:
Par o impar. Positivo o negativo. Entero o decimal*/

        Scanner teclado = new Scanner (System.in);

        double d;

        System.out.println("Escribe un número: ");
        d = Double.parseDouble(teclado.nextLine());


        if(d % 2 == 0) {
            System.out.println(d + " es un número par");
        }else {
            System.out.println(d + " es un numero impar");
        }

        if(d < 0) {
            System.out.println(d + " el número es negativo");
        } else {
            System.out.println(d + " el número es positivo");
        }

        if (d % 1 == 0) {
            System.out.println(d + " es un numero entero");
        } else {
            System.out.println(d + " es un numero decimal");
        }
        

        teclado.close();

    }
}

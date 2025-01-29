import java.util.Scanner;

public class Ejercicio7U3 {
    /*
     * Escribir un programa en Java que dado por teclado un número, escriba lo siguiente: 

        a. “A” si su módulo con 5 es 0 

        b. “B” si su módulo con 5 es 1 

        c. “C” si su módulo con 5 es 2 

        d. “D” si su módulo con 5 es 3 

        e. “E” si su módulo con 5 es 4 

        f. “F” en otro caso 
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = teclado.nextInt();

        final char A = 'A';
        final char B = 'B';
        final char C = 'C';
        final char D = 'D';
        final char E = 'E';
        final char F = 'F';

        System.out.println("El resultado es: ");
        switch(num % 5){
            case 0:
                System.out.println(A);
                break;
            case 1:
                System.out.println(B);
                break;
            case 2:
                System.out.println(C);
                break;
            case 3:
                System.out.println(D);
                break;
            case 4:
                System.out.println(E);
                break;
            default:
                System.out.println(F);
                break;
        }
        teclado.close();
    }
}

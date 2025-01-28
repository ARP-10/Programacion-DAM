import java.util.Scanner;

public class u3Ejercicio7 {

    public static void main(String[] args){

        /*Escribir un programa en Java que dado por teclado un número, escriba lo siguiente: 
                a. “A” si su módulo con 5 es 0 
                b. “B” si su módulo con 5 es 1 
                c. “C” si su módulo con 5 es 2 
                d. “D” si su módulo con 5 es 3 
                e. “E” si su módulo con 5 es 4 
                f. “F” en otro caso  */
        
        Scanner teclado = new Scanner(System.in);

        int m;

        System.out.println("Inserta un número positivo: ");

        m = teclado.nextInt();

        int modulo = m % 5;

        System.out.println(modulo);

        if (modulo == 0){
            System.out.println("A");
        } 
        else if (modulo == 1){
            System.out.println("B");
        }
        else if (modulo == 2){
            System.out.println("C");
        }
        else if (modulo == 3){
            System.out.println("D");
        }
        else if (modulo == 4){
            System.out.println("E");
        } 
        
        else {
            System.out.println("F");
        }
        
        teclado.close();
        

    }
    
}

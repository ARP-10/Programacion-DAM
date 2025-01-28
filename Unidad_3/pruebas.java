import java.util.Scanner;

public class pruebas {

    public static void main(String[] args){

        /*Escribir un programa en Java que dado un número por teclado, escriba “El número es válido” si: 
            a. El número se encuentra entre 1000 y 10000 
            b. El número no es divisible por 5 ni termina en 0 En caso contrario, el texto debe ser “El número NO es válido”.  */

        Scanner teclado = new Scanner(System.in);

        int arp;

        System.out.println("Escribe un número: ");
        arp = teclado.nextInt();

        arp = 5 / arp ;

        if (arp == 0){
            System.out.println("ok");
        } else {
            System.out.println("no ok");
        }


        teclado.close(); 
    }
}

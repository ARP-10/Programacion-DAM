import java.util.Scanner;

public class u2Ejercicio3 {

    public static void main(String[] args){

    //Implementar un programa en Java que dado un número entero de 5 dígitos, lo escriba al revés

   /* int r = 12345;
    
    //12345:10 ----> 2134,5 (int) el resultado es (int) 1234. % el  resto a dividir 12345 entre 10 = 5

    int unidades = r%10;
    int decenas = (r/10)%10; // (1234)%10 ---> 4
    int centenas = (r/10/10)%10; // (123)%10 --->3
    int unidadesMillar = (r/10/10/10)%10;
    int decenasMillar = (r/10/10/10/10)%10;

    System.out.println("El número " + r + " al revés es: " + unidades + decenas + centenas + unidadesMillar + decenasMillar); */

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número entero de 5 cifras: ");
    int r2 = teclado.nextInt();
    int resto = 0;
    int numeroInvertido = 0;
    while (r2 > 0) {
        resto = r2 % 10; //5; 4; 3; 2; 1
        r2 = r2 / 10; // r2 = 1234; 123; 12; 1; 0
        numeroInvertido = numeroInvertido * 10 + resto; // 5 * 10 + 4 = 54 ; 54 * 10 + 3 = 543 ; 543 * 10 + 2 = 5432 ; 54321
    }

    System.out.println("El número introducido al revés es " + numeroInvertido);

    teclado.close();
    }
}

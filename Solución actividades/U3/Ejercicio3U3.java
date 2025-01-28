import java.util.Scanner;

public class Ejercicio3U3 {
    /*
     * Dados un dividendo y un divisor, indique por pantalla si la división de ambos es exacta.
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un dividendo: ");
        double dividendo = teclado.nextDouble();
        System.out.println("Introduce un divisor: ");
        double divisor = teclado.nextDouble();

        if (dividendo % divisor == 0){
            System.out.println("La división de " + dividendo + " entre " + divisor + " es EXACTA");
        } else {
            System.out.println("La división de " + dividendo + " entre " + divisor + " NO es EXACTA");
        }
        teclado.close();
    }
}

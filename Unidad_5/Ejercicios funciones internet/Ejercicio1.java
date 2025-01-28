import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        /*EJERCICIO 1: Crear un programa que tome 3 notas de un estudiante y diga la nota final del curso.
            Hay que tener en cuenta que la primera y la segunda nota valen el 30% de la nota final.
            La tercera nota vale el 40%.*/

        Scanner teclado = new Scanner (System.in);

        double n1, n2, n3, notaFinal;

        System.out.println("Ingresa la primera nota: ");
        n1 = teclado.nextDouble();

        System.out.println("Ingresa la segunda nota: ");
        n2 = teclado.nextDouble();

        System.out.println("Ingresa la tercera nota: ");
        n3 = teclado.nextDouble();

        notaFinal = calcularNotaFinal(n1, n2, n3);

        System.out.println("La nota final del estudiante es: " + notaFinal);

        teclado.close();

    }

    public static double calcularNotaFinal (double n1, double n2, double n3){

        return (n1*0.3) + (n2*0.3) + (n3*0.4);
    }

}

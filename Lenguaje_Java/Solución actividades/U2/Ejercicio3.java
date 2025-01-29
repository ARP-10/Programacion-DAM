import java.util.Scanner;

public class Ejercicio3{
    /*
     * Implementar un programa en Java que dado un número entero de 5 dígitos, lo escriba al revés. 
     * Ejemplo: 13578 se muestra como 87531.
     */
    public static void main (String[] args){
        // Método 1: solo con lo visto hasta la U2
        int num = 13578;
        int unidades = num%10; // 13578 entre 10 el resto es 8
        int decenas = (num/10)%10; // Trabajamos con enteros, "/" nos da la división entera es decir 1357
        int centenas = (num/10/10)%10;
        int unidadesMillar = (num/10/10/10)%10;
        int decenasMillar = (num/10/10/10/10)%10;
        System.out.println("El número " + num + " al revés es: " + unidades + decenas + centenas + unidadesMillar + decenasMillar);

        // Método 2: incluimos lo visto en la U3
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número entero de 5 dígitos que quieras darle la vuelta: ");
        int num2 = teclado.nextInt();
        int numInvertido = 0;
        int resto;
        while (num2 > 0){
            resto = num2 % 10;
            numInvertido = numInvertido * 10 + resto;
            num2 /= 10;
        }
        System.out.println("El número introducido al revés es: " + numInvertido);

        // Añadir condición 5 cifras (con if)
        System.out.println("Introduce el número entero de 5 dígitos que quieras darle la vuelta: ");
        int num3 = teclado.nextInt();
        int numInvertido2 = 0;
        int resto2;
        if (Integer.toString(num2).length()==5){
            while (num3 > 0){
                resto2 = num3 % 10;
                numInvertido2 = numInvertido2 * 10 + resto2;
                num3 /= 10;
            }
            System.out.println("El número introducido al revés es: " + numInvertido2);
        } else{
            System.out.println("El número introducido no tiene 5 dígitos.");
        }

        // Utilizar un for
        System.out.println("Introduce el número entero de 5 dígitos que quieras darle la vuelta: ");
        int num4 = teclado.nextInt();
        int numInvertido3 = 0;
        int resto3;
        while (Integer.toString(num4).length()!=5){
            System.out.println("El número introducido no tiene 5 cifras, introduzca de nuevo otro número");
            num4 = teclado.nextInt();
        }
        for (int i = 0; i<5; i++){
            resto3 = num4 % 10;
            numInvertido3 = numInvertido3*10 + resto3;
            num4 /= 10;
        }
        System.out.println("El número introducido al revés es: " + numInvertido3);
        teclado.close();
    }
}
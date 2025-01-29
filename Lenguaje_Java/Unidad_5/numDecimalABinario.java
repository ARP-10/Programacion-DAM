import java.util.Scanner;

public class numDecimalABinario {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //Convertir un número decimal a binario

        /* FORMA 1 

        int decimal, modulo, aux;
        String binario = "";

        System.out.println("Ingresa el número decimal ");

        decimal = teclado.nextInt();

        aux = decimal;

        while (decimal > 0) {
            modulo = (decimal%2);
            binario = modulo + binario;
            decimal = decimal/2;
        }

        System.out.println("El número " + aux + " en binario es: " + binario); */

        //FORMA 2

        System.out.println("Ingresa un número decimal: ");

        int input = teclado.nextInt();

        int digito;
        String binario = "";

        do {
            digito = input % 2; 
            binario += digito; //Aquí la variable binario concatena la variable digito
            input = input / 2;
        } while (input != 0); //Cuando llegue a 0 se detendrá

        binario = new StringBuilder(binario).reverse().toString(); //Esto es para invertir el número binario que tenemos y lo almacenamos en binario

        System.out.println("El número en binario es: " + binario);

        teclado.close(); 

    }
    
}

import java.util.Scanner;

public class Digitos {
    
    public static void main(String[] args){

        
        //FALTA HACER QUE IMPRIMA POR PANTALLA Y HACER QUE EL USUARIO META UN NUMERO
        
        Scanner teclado = new Scanner(System.in);

        

        System.out.println("Introduce un número entero: ");

        //int numero = teclado.nextInt();

        //numero = contarDigitos(resultado);

        

        

        teclado.close();
    }

    public int contarDigitos(int numero){


        int res;

        if (numero<10) { //Aquí ponemos que cuando el número sea menor que 10, la respuesta será 1
            res = 1;
        } else { //Aquí entramos en la parte recursiva
            numero = numero / 10;
            res = 1 + contarDigitos(numero); //Justo en la línea anterior hemos modificado el valor de numero, sino sería un ciclo infinito
        }

        return res;

    }

}

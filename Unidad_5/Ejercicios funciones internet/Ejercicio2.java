import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        //NO FUNCIONA

        /*EJERCICIO 2: Crear un programa que valide si una contraseña especificada por el usuario es segura.
            - Tiene más de 8 caracteres
            - Tiene al menos una letra mayúscula
            - Tiene al menos un número 
        */
        Scanner teclado = new Scanner(System.in);

        String password;

        System.out.println("Ingrese una contraseña: ");
        password = teclado.next();

        if(esSegura(password)){
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }

        teclado.close();

    }
    
    public static boolean esSegura(String password) {

        if(password.length()>8) {

            boolean mayus = false; //Se declaran aquí porque en caso de que no encuentre un número o una mayus, estas variables SIEMPRE van a ser = false
            boolean numero = false;
            char c;

            for (int i=0; i<password.length(); i++){

                c = password.charAt(i); //Va almacenando caracter a caracter la contraseña que hemos ingresado

                if (Character.isDigit(c)); //Aquí evaluamos si alguno de los caracteres aque hemos almacenado es un número de ahí que:
                    numero = true;
                if (Character.isUpperCase(c));
                    mayus = true;
            }

            if (numero && mayus){ //No es necesario poner numero == true porque es boolean 
                return true;
            } else { 
                return false; 
            }

        } else {
            return false;
        }

    }
}

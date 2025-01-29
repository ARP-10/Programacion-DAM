import java.util.Scanner;


public class Contraseña {
    public static void main(String[] args) {
        
        /*Pedir al usuario nombre y contraseña. Si la contraseña es correcta (Suponemos "1234" para el usuario "alumno" 
        el programa mostrará un mensaje de bienvenida ("Hola..." y el login introducido) Si la contraseña no es correcta, 
        se volverá a pedir con un máximo de 3 oportunidades. Si aun así no es correcta, se mostrará un mensaje de errror.*/

        //Realizar una función validar que se encargue de validar si el user y pass son correctos.

        Scanner teclado = new Scanner (System.in);

        int contador = 0; //Necesitamos esta variable para llevar la cuenta de cuántas veces se escribe la contraseña

        boolean valido = false;

        do{ //Aquí vamos a verificar
            System.out.println("Introduce tu usuario: ");
            String user = teclado.nextLine();

            System.out.println("Introduce tu contraseña: ");
            String pass = teclado.nextLine();

            //Anulamos toda esta parte porque...
            /*if (user.equals("alumno") && pass.equals("1234")){
                valido = true; //Si "valido" es true, se queda aquí y no hace el while. Pero su valido es false, pasa al while
                System.out.println("Hola " + user); //Si la contraseña es correcta, el programa muestra una frase de bienvenida
            }*/ 

            //... la sustituimos por : (utilizando la función escrita abajo, fuera del main)
            valido = validar (user, pass);

            contador ++;

        } while (valido == false && contador < 3);
            if (valido == false) {
                //System.out.println("La contraseña no es correcta, ha superado el límite de intentos."); En vez de imprimir así podemos llamar a la función (abajo):
                errorFinal();
            }

        teclado.close();

        //Hacemos el mismo ejercicio pero con funciones
        

    }

    //Las funciones se declaraan SIEMPRE se declaran fuera del main

    public static boolean validar (String usuario, String contrasenia) { //Es importante poner un nombre descriptivo. Si la función no devuelve nada, escribimos "void". Pero si queremos que devuelva algo escribimos el tipo de variable 
    
        String usuarioValido = "alumno";
        String passValida = "1234";

        if (usuario.equals(usuarioValido) && contrasenia.equals(passValida)){
            System.out.println("Hola " + usuario);
            return true; //En cuanto ponemos un return, sale. Es igual que un break
        }

        return false;
    }    

    //Dentro de una función podemos llamar a otra función

    public static void saludar (String usuario){
        System.out.println("Hola " + usuario);
    }

    public static void errorFinal (){
        System.out.println("La contraseña no es correcta, ha superado el límite de intentos.");
    }
}

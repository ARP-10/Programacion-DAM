package Ejercicio3;

import java.util.Scanner;

public class Ejercicio {
    
    public static void validaDNI(String DNI) throws ErrorValidacionDNI {
       
        String dni = "";

        if (dni.length() !=9) {
        throw new ErrorValidacionDNI("Longitud no valida");
       } 

       if (!Character.isLetter(dni.charAt(8))) {
        throw new ErrorValidacionDNI("El ultimo caracter no es una letra");
       }

       for (int i=0; i<8; i++) {
        if (!Character.isDigit(dni.charAt(i))) {
            throw new ErrorValidacionDNI("La numeracion contiene digitos no validos");
        }
       }

       //Si queremos hacerlo con try y catch:
       /*
        * try {
            if (dni.length() !=9) {
                throw new ErrorValidacionDNI("Longitud no valida");
            } 

            if (!Character.isLetter(dni.charAt(8))) {
                throw new ErrorValidacionDNI("El ultimo caracter no es una letra");
            }

            for (int i=0; i<8; i++) {
                if (!Character.isDigit(dni.charAt(i))) {
                    throw new ErrorValidacionDNI("La numeracion contiene digitos no validos");
                }
            }
        } catch (ErrorValidacionDNI e) {
            Sysout("Excepcion: " + e.getMessage());
        } finally {
            Sysout("Finally") //El finally siempre se ejecuta
        }
         */

    }

    public static void main(String[] args) throws ErrorValidacionDNI{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un DNI");
        String dni = teclado.nextLine();
        validaDNI(dni);
        teclado.close();
    }
}


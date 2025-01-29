package EjemploExcepcion;

import java.util.Scanner;

public class EjemploIntervaloExcepcion {
    //LAS EXCEPCIONES SON OBJETOS    
    //Pedimos un numero por teclado, si no esta entre 0 y 100 lanmzamos una excepcion.
    //Hay que eindicar en la cabecera del metodo que puede lanzarla (throws IntervalException), por ser derivada de Excepcion -> checked


    public static void main(String[] args) throws IntervalException{

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        teclado.close();

        /* En el ejemplo sin try y catch el codigo finalizaba asi:
         * 
         * if (num<0 || num>100) { //Quiero lanzar la excepcion si el numero es menor que cero o mayor que 100
            throw new IntervalException("El numero no esta en el intervalo deseado"); //Para lanzar nuestra excepcion ponemos "throw new" (porque es un objeto) nombredenuestraclaseexcepcion
        *   }
         */

        try {
            if (num<0 || num>100) { 
                throw new IntervalException("El numero no esta en el intervalo deseado"); 
            }
        } catch (IntervalException e) {
            System.out.println("Excepcion capturada: " + e.getMessage()); //Aqui get.Message() nos va a devolver el mensaje de "El numero no esta en el intervalo deseado"
            e.printStackTrace(); //Saca la traza de error
        } catch (Exception e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    
    }

}

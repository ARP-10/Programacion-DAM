import java.util.Scanner;

public class u2Ejercicio4 {

        public static void main(String[] args){

            //Diseñar un programa en Java que convierta una cantidad positiva de segundos, a su equivalente en horas, minutos y segundos
            
            Scanner teclado = new Scanner(System.in);
            
            int segundosIniciales, segundos, minutos, horas;
            
            System.out.println("Introduce el valor de los segundos: ");

            segundosIniciales = teclado.nextInt();

            minutos = segundosIniciales / 60;

            segundos = segundosIniciales % 60;

            horas = minutos / 60;

            minutos = minutos % 60;

            System.out.println(segundosIniciales + " segundos son: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

            teclado.close();


        }
    
}

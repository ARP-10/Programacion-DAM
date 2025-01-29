package CarreraGalgos;

import java.util.Scanner;

public class CarreraGalgos extends Thread{
    private String nombre;
    private int tiempo;
    private static int contador = 1;
    
    public CarreraGalgos(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public void run(){
        try {
            System.out.println("El galgo " + nombre + " ha comenzado la carrera");
            Thread.sleep(tiempo * 1000);
            System.out.println("El galgo " + nombre + " ha terminado la carrera y llegó en " + contador + "º lugar");
            contador++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("5 galgos van a participar en una carrera.");
        System.out.println("Cuánto tiempo tarda cada galgo en finalizar el rrecorrido? ");
        
        CarreraGalgos[] galgos = new CarreraGalgos[5];
        String[] nombres = {"Kurapika", "Gon", "Killua", "Kite", "Hisoka"};

        for (int i=0; i<galgos.length; i++) {
            System.out.println("Tiempo para " + nombres[i] + ": ");
            int tiempo = teclado.nextInt();
            galgos[i] = new CarreraGalgos(nombres[i], tiempo);
        }

        System.out.println("Comienza la carrera!");

        for (CarreraGalgos galgo : galgos) {
            galgo.start();
        }

        for (CarreraGalgos galgo : galgos) {
            try {
                galgo.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        teclado.close();
    


    }
    



}
package BebederoPerros;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class BebederoPerros extends Thread{
    private Semaphore semaforo = new Semaphore(3);
    private static int totalPerros;
    private int idPerro;
    private static int aguaBebida = 0;

    public BebederoPerros(int idPerro) {
        this.idPerro = idPerro;
    }

    @Override
    public void run() {
        try {
            int tiempo = (int) (Math.random() * 10000) + 100;
            System.out.println("El perro " + idPerro + " está esperando a poder beber");

            semaforo.acquire();
            System.out.println("El perro " + idPerro + " ha comenzado a beber");

            Thread.sleep(tiempo);

            int cantidadAgua = tiempo / 1000;

            System.out.println("El perro " + idPerro + " ha terminado de beber agua");
            semaforo.release();

            agregarAgua(cantidadAgua);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    private static synchronized void agregarAgua(int cantidad) {
        aguaBebida += cantidad;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Rellenando los cuencos de agua para los perritos...");
        System.out.println("Cuántos perros hay hoy en la perrera?");
        totalPerros = teclado.nextInt();

        Thread[] perros = new Thread[totalPerros];

        for (int i=0; i<perros.length; i++) {
            perros[i] = new BebederoPerros(i+1);
            perros[i].start();
        }

        /* En vez de crear e inicializar a la vez, se puede hacer por separado
        for (BebederoPerros perro : perros) {
            perro.start();
        }
        */

        for (Thread perro : perros) {
            try {
                perro.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("En total los perros han bebido " + aguaBebida + " litros de agua.");

        teclado.close();
    }
    
}

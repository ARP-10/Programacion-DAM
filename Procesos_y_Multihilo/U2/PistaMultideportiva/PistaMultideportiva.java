package PistaMultideportiva;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class PistaMultideportiva extends Thread{
    private int idJugador;
    private static int pista1 = 0;
    private static int pista2 = 0;
    private static int pista3 = 0;
    private static int pista4 = 0;
    private Semaphore pista1semaforo = new Semaphore(4);
    private Semaphore pista2semaforo = new Semaphore(4);
    private Semaphore pista3semaforo = new Semaphore(4);
    private Semaphore pista4semaforo = new Semaphore(4);

    public PistaMultideportiva(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public void run() {
        try {
            int pistaAleatorio = (int)(Math.random()*4) + 1;
            switch (pistaAleatorio) {
                case 1:
                    pista1semaforo.acquire();
                    System.out.println("Jugador " + idJugador + " entrando en pista 1");
                    pista1 += 5;
                    System.out.println("Pista 1 en uso");
                    Thread.sleep(5000);
                    pista1semaforo.release();
                    System.out.println("Pista 1 libre");
                    break;

                case 2: 
                    pista2semaforo.acquire();
                    System.out.println("Jugador " + idJugador + " entrando en pista 2");
                    pista2 += 5;
                    
                    System.out.println("Pista 2 en uso");
                    Thread.sleep(5000);
                    pista2semaforo.release();
                    System.out.println("Pista 2 libre");
                    break;

                case 3: 
                    pista3semaforo.acquire();
                    System.out.println("Jugador " + idJugador + " entrando en pista 3");
                    pista3 += 5;
                    System.out.println("Pista 3 en uso");
                    Thread.sleep(5000);
                    pista3semaforo.release();
                    System.out.println("Pista 3 libre");
                    break;

                case 4:
                    pista4semaforo.acquire();
                    System.out.println("Jugador " + idJugador + " entrando en pista 4");
                    pista4 += 5;
                    System.out.println("Pista 4 en uso");
                    Thread.sleep(5000);
                    pista4semaforo.release();
                    System.out.println("Pista 4 libre");
                    break;
                default:
                    break;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("El polideportivo abre sus puertas");
        System.out.println("Cuántas personas vienen a jugar hoy? (Sólo múltiplos de 4)");
        int totalJugadores = teclado.nextInt();

        Thread[] jugadores = new Thread[totalJugadores];
        for (int i=0; i<jugadores.length; i++) {
            jugadores[i] = new PistaMultideportiva(i + 1);
            jugadores[i].start();
        }

        for (Thread jugador : jugadores) {
            try {
                jugador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El polideportivo cierra sus puertas");
        int totalPistas = pista1 + pista2 + pista3 + pista4;
        System.out.println("El dinero total recaudado ha sido: " + totalPistas);

        teclado.close();


    }

}

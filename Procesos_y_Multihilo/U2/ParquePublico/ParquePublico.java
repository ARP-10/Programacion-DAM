package ParquePublico;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class ParquePublico extends Thread{
    private int idPersona;
    private static int puerta1;
    private static int puerta2;
    private static int puerta3;
    private Semaphore puerta1semaforo = new Semaphore(1);
    private Semaphore puerta2semaforo = new Semaphore(1);
    private Semaphore puerta3semaforo = new Semaphore(1);

    public ParquePublico(int idPersona) {
        this.idPersona = idPersona;
    }


    @Override
    public void run() {
        int puertaAleatorio = (int)(Math.random() * 3) + 1;
        try {
            switch (puertaAleatorio) {
                case 1:
                    puerta1semaforo.acquire();
                    System.out.println("Persona " + idPersona + " entra en el parque por la puerta 1");
                    Thread.sleep(5000);
                    puerta1++;                    
                    puerta1semaforo.release();
                    break;
                
                case 2:
                    puerta2semaforo.acquire();
                    System.out.println("Persona " + idPersona + " entra en el parque por la puerta 2");
                    Thread.sleep(5000);
                    puerta2++;                    
                    puerta2semaforo.release();
                    break;

                case 3: 
                    puerta3semaforo.acquire();
                    System.out.println("Persona " + idPersona + " entra en el parque por la puerta 3");
                    Thread.sleep(5000);
                    puerta3++;                    
                    puerta3semaforo.release();
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
        System.out.println("Se abren las puertas del parque");
        System.out.println("Cuántas personas vienen hoy al parque?");
        int totalPersonas = teclado.nextInt();
        Thread[] personas = new Thread[totalPersonas];
        for (int i=0; i<personas.length; i++) {
            personas[i] = new ParquePublico(i + 1);
            personas[i].start();
        }

        for (Thread persona : personas) {
            try {
                persona.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Se cierran las puertas del parque");
        System.out.println("Por la puerta 1 han pasado: " + puerta1 + " personas");
        System.out.println("Por la puerta 2 han pasado: " + puerta2 + " personas");
        System.out.println("Por la puerta 3 han pasado: " + puerta3 + " personas");
        teclado.close();

    }
}

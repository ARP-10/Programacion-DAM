package TiendaDeportes;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class TiendaDeportes extends Thread{
    private int idCliente;
    private static double caja1;
    private static double caja2;
    private static double caja3;
    private static double caja4;
    private Semaphore tiendaSemaforo = new Semaphore(10);
    private Semaphore caja1semaforo = new Semaphore(1);
    private Semaphore caja2semaforo = new Semaphore(1);
    private Semaphore caja3semaforo = new Semaphore(1);
    private Semaphore caja4semaforo = new Semaphore(1);

    public TiendaDeportes(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public void run() {
        try {
            System.out.println("El cliente " + idCliente + " está esperando a poder entrar a la tienda");
            tiendaSemaforo.acquire();
            System.out.println("El cliente " + idCliente + " entra a la tienda");

            int elegirCaja = (int) Math.floor(Math.random() * 4) + 1;
            switch (elegirCaja) {
                case 1:
                    caja1semaforo.acquire();
                    System.out.println("El cliente " + idCliente + " acude a la caja 1");
                    Thread.sleep(4000);
                    caja1 = Math.floor(Math.random() * 100) + 1;
                    caja1semaforo.release();
                    System.out.println("El cliente " + idCliente + " sale de la tienda");
                    break;

                case 2: 
                    caja2semaforo.acquire();
                    System.out.println("El cliente " + idCliente + " acude a la caja 2");
                    Thread.sleep(4000);
                    caja2 = Math.floor(Math.random() * 100) + 1;
                    caja2semaforo.release();
                    System.out.println("El cliente " + idCliente + " sale de la tienda");
                    break;
            
                case 3:
                    caja3semaforo.acquire();
                    System.out.println("El cliente " + idCliente + " acude a la caja 3");
                    Thread.sleep(4000);
                    caja3 = Math.floor(Math.random() * 100) + 1;
                    caja3semaforo.release();
                    System.out.println("El cliente " + idCliente + " sale de la tienda");
                    break;

                case 4:
                    caja4semaforo.acquire();
                    System.out.println("El cliente " + idCliente + " acude a la caja 4");
                    Thread.sleep(4000);
                    caja4 = Math.floor(Math.random() * 100) + 1;
                    caja4semaforo.release();
                    System.out.println("El cliente " + idCliente + " sale de la tienda");
                    break;

                default:
                    break;
            }

            tiendaSemaforo.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("La tienda abre sus puertas");
        System.out.println("Cuántas personas van a entrar hoy?");
        int totalClientes = teclado.nextInt();

        Thread[] clientes = new Thread[totalClientes];
        for (int i=0; i<clientes.length; i++) {
            clientes[i] = new TiendaDeportes(i + 1);
            clientes[i].start();
        }

        for (Thread cliente : clientes) {
            try {
                cliente.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("La tienda cierra sus puertas");
        System.out.println("La caja 1 ha cobrado " + caja1 + " euros");
        System.out.println("La caja 2 ha cobrado " + caja2 + " euros");
        System.out.println("La caja 3 ha cobrado " + caja3 + " euros");
        System.out.println("La caja 4 ha cobrado " + caja4 + " euros");
        double totalCajas = caja1 + caja2 + caja3 + caja4;
        System.out.println("En total todas las cajas han cobrado: " + totalCajas + " euros");
        teclado.close();
    }
}

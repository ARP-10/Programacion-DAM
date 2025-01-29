public import java.util.concurrent.Semaphore;

public class Principal extends Thread {
    public static int mesa;
    public static int idPersona;
    public static int articulo;
    public static int articulosTotal;
    
    public static int mesa1;
    public static int mesa2;
    public static int mesa3;
    public static int mesa4;
    public static int mesa5;

    public static Semaphore mesa1semaforo = new Semaphore(1);
    public static Semaphore mesa2semaforo = new Semaphore(1);
    public static Semaphore mesa3semaforo = new Semaphore(1);
    public static Semaphore mesa4semaforo = new Semaphore(1);
    public static Semaphore mesa5semaforo = new Semaphore(1);

    public Principal(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public void run() {
        try {
			switch(mesa) {
				case 1: {
					mesa1semaforo.acquire();
                    System.out.println("Una persona acude a la mesa 1");
                    Thread.sleep(1000);
                    articulo = (int) (Math.random() * 3) + 1;
                    System.out.println("La persona de la mesa 1 ha escogido " + articulo + " artículos");
                    articulosTotal += articulo;
                    System.out.println("La mesa 1 queda libre");
                    mesa1semaforo.release();
                    mesa1++;
					break;
				}
				case 2: {
					mesa2semaforo.acquire();
                    System.out.println("Una persona acude a la mesa 2");
                    Thread.sleep(1000);
                    articulo = (int) (Math.random() * 3) + 1;
                    System.out.println("La persona de la mesa 2 ha escogido " + articulo + " artículos");
                    articulosTotal += articulo;
                    System.out.println("La mesa 2 queda libre");
                    mesa2semaforo.release();
                    mesa2++;
					break;
				}
				case 3: {
					mesa3semaforo.acquire();
                    System.out.println("Una persona acude a la mesa 3");
                    Thread.sleep(1000);
                    articulo = (int) (Math.random() * 3) + 1;
                    System.out.println("La persona de la mesa 3 ha escogido " + articulo + " artículos");
                    articulosTotal += articulo;
                    System.out.println("La mesa 3 queda libre");
                    mesa3semaforo.release();
                    mesa3++;
					break;
				}
                case 4: {
                    mesa4semaforo.acquire();
                    System.out.println("Una persona acude a la mesa 4");
                    Thread.sleep(1000);
                    articulo = (int) (Math.random() * 3) + 1;
                    System.out.println("La persona de la mesa 4 ha escogido " + articulo + " artículos");
                    articulosTotal += articulo;
                    System.out.println("La mesa 4 queda libre");
                    mesa4semaforo.release();
                    mesa4++;
                    break;
                }
                case 5: {
                    mesa5semaforo.acquire();
                    System.out.println("Una persona acude a la mesa 5");
                    Thread.sleep(1000);
                    articulo = (int) (Math.random() * 3) + 1;
                    System.out.println("La persona de la mesa 5 ha escogido " + articulo + " artículos");
                    articulosTotal += articulo;
                    System.out.println("La mesa 5 queda libre");
                    mesa5semaforo.release();
                    mesa5++;
                    break;
                }
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        System.out.println("Abriendo las puertas del banco de alimentos...");
        int personas = (int) Math.floor(Math.random() + 30);
        Thread[] hilos = new Thread[personas];

        try {
            for (int i = 0; i < hilos.length; i++) {
            	hilos[i] = new Principal(i + 1);
            	mesa = i % 5 + 1; 
                hilos[i].start();
                idPersona++;
            }
            for (Thread hilo : hilos) {
                hilo.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El número total de personas ha sido: " + idPersona);
        System.out.println("Personas por mesa: ");
        System.out.println("Mesa 1: " + mesa1);
        System.out.println("Mesa 2: " + mesa2);
        System.out.println("Mesa 3: " + mesa3);
        System.out.println("Mesa 4: " + mesa4);
        System.out.println("Mesa 5: " + mesa5);
        System.out.println("Artículos entregados en total: " + articulosTotal);
    }
} {
    
}

import java.util.concurrent.Semaphore;

public class Mesa {
    public static Semaphore[] semaforos = {new Semaphore(1), new Semaphore(1), new Semaphore(1),
                                           new Semaphore(1), new Semaphore(1)};
    public static int[] articulosPorMesa = new int[5];
    public static int articulosTotal = 0;

    public static void entregarArticulos(int mesa, int articulos) {
        try {
            semaforos[mesa - 1].acquire();
            System.out.println("Una persona acude a la mesa " + mesa);
            Thread.sleep(1000);
            System.out.println("La persona de la mesa " + mesa + " ha escogido " + articulos + " artículos");
            articulosTotal += articulos;
            System.out.println("La mesa " + mesa + " queda libre");
            semaforos[mesa - 1].release();
            articulosPorMesa[mesa - 1]++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarPersonaxMesa() {
        System.out.println("Personas por mesa:");
        for (int i = 0; i < articulosPorMesa.length; i++) {
            System.out.println("Mesa " + (i + 1) + ": " + articulosPorMesa[i]);
        }
    }
}
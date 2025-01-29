public class Principal {
    public static int totalPersonas = 30;
    public static void main(String[] args) {
        System.out.println("Abriendo las puertas del banco de alimentos...");
        int personas = (int) Math.floor(Math.random() + 30);
        Thread[] hilos = new Thread[personas];

        try {
            for (int i = 0; i < hilos.length; i++) {
                hilos[i] = new Thread(new Persona(i + 1));
                hilos[i].start();
            }
            for (Thread hilo : hilos) {
                hilo.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n");
        System.out.println("Fin del día, mostrando datos...");
        System.out.println("Número total de personas: " + totalPersonas);
        Mesa.mostrarPersonaxMesa();
        System.out.println("Artículos entregados en total: " + Mesa.articulosTotal);
    }
}
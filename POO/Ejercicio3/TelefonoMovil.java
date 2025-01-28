package Ejercicio3;

public class TelefonoMovil extends ProductoElectronico implements ConectividadInternet{
    
    //Atributos
    private int numModelo;
    private int capacidadAlmacenamiento;
    private int nucleos;
    private static int totalTelefonos = 0; //Metodo de clase 

    //Constructor
    public TelefonoMovil(String nombreProducto, double precio, String marca, int numModelo, int capacidadAlmacenamiento, int nucleos) {
        super(nombreProducto, precio, marca);
        this.numModelo = numModelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.nucleos = nucleos;
        totalTelefonos++;
    }

    public static int getTotalTelefonos() {
        return totalTelefonos;
    } 

    //Metodos get
    public int getNumModelo() {
        return numModelo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getNucleos() {
        return nucleos;
    }

    //Interfaz
    public void conectarInternet() {
        System.out.println("El telefono se ha conectado a traves de una red movil.");
    }
}

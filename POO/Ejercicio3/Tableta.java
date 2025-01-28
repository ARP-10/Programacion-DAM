package Ejercicio3;

public class Tableta extends ProductoElectronico implements ConectividadInternet {
    
    //Atributos
    private double tamanoPantalla;
    private int capacidadAlmacenamiento;
    private String tipoBateria;

    public Tableta (String nombreProducto, double precio, String marca, double tamanoPantalla, int capacidadAlmacenamiento, String tipoBateria) {
        super(nombreProducto, precio, marca);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoBateria = tipoBateria;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    @Override
    public void conectarInternet() {
        System.out.println(getNombreProducto() + " se conecta a Internet a traves de Wi-Fi.");
    }
}

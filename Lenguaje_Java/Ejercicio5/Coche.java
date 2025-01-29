package Ejercicio5;

public class Coche extends Vehiculo {
    
    //Atributos
    private String andar;
    private String quemarRueda;
    private double verKm;

    //Constructores
    public Coche() {

    }

    public Coche(int vehiculosCreados, double kilometrosTotales, double kilometrosRecorridos, String andar, String quemarRueda, double verKm) {
        super(vehiculosCreados, kilometrosRecorridos, kilometrosTotales);
        this.andar = andar;
        this.quemarRueda = quemarRueda;
        this.verKm = verKm;
    }
}

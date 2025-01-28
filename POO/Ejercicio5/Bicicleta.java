package Ejercicio5;

public class Bicicleta extends Vehiculo{

    //Atributos
    private String andar;
    private String caballito;
    private double verKm;

    //Constructores
    public Bicicleta() {

    }

    public Bicicleta (int vehiculosCreados, double kilometrosTotales, double kilometrosRecorridos, String andar, String caballito, double verKm) {
        super(vehiculosCreados, kilometrosRecorridos, kilometrosTotales);
        this.andar = andar;
        this.caballito = caballito;
        this.verKm = verKm;
    }
    
}

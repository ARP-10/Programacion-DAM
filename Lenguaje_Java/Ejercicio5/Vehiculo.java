package Ejercicio5;

public class Vehiculo {
    
    //Atributos
    private int vehiculosCreados;
    private double kilometrosTotales;
    private double kilometrosRecorridos; //de clase

    
    //Constructores
    public Vehiculo(){

    }

    public Vehiculo (int vehiculosCreados, double kilometrosTotales, double kilometrosRecorridos){
        this.vehiculosCreados = vehiculosCreados;
        this.kilometrosTotales = kilometrosTotales;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    //Métodos
    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public double getKilometrosTotales() {
        return kilometrosTotales;
    }
}

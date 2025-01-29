package Unidades_6_7_8.Ejercicio4;

public class Vehiculo {
    
    //Atributos
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    //Constructores
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void recorre(int k) {
        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
    }

    



}

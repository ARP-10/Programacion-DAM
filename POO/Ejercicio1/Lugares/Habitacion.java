package Ejercicio1.Lugares;

import Ejercicio1.Iluminacion.Bombilla;

public class Habitacion {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        bombilla1.apagar();
        System.out.println(bombilla1.getEstado()); //Utilizamos getEstado por que nuestro modificador de acceso es private, así puede acceder a el. Si ponemos bombilla1.estado nos va a marcar error.
    }
}
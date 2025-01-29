package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        //Creamos un objeto TelefonoMovil
        TelefonoMovil telefono = new TelefonoMovil("iPhone",1200, "Apple", 12, 256, 6);
        
        //Llamamos al metodo conectarInternet
        telefono.conectarInternet();

        //Creamos un objeto Tableta
        Tableta tablet = new Tableta("iPad Pro", 800, "Apple", 9.7, 340, "Carga Rapida");
        
        //Llamamos al metodo conectarInternet
        tablet.conectarInternet();
    }
}

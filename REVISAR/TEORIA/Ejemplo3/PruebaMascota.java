package Ejemplo3;

/**
 * PruebaMascota.java
 * Programa que prueba la interfaz Mascota
 *
 */
public class PruebaMascota {
    public static void main(String[] args) {
        Mascota garfield = new GatoAle("macho", "34569"); 
        Mascota lisa = new GatoAle("hembra", "96059"); 
        Mascota kuki = new Perro("hembra", "234678"); 
        Mascota ayo = new Perro("macho", "778950");
        System.out.println(garfield.getCodigo());
        System.out.println(lisa.getCodigo());
        System.out.println(kuki.getCodigo());
        System.out.println(ayo.getCodigo());
        garfield.come("pescado");
        lisa.come("hamburguesa");
        kuki.come("pescado");
        // Mascota garfield = new Mascota(Sexo.MACHO, "34569"); // Una interfaz no se puede instanciar, esta línea daría error
    }
}

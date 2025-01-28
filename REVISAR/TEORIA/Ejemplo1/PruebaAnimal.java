package Ejemplo1;

/**
 * PruebaAnimal.java
 * Programa que prueba la clase Animal y sus subclases
 */
public class PruebaAnimal {
    public static void main(String[] args) {
    Gato garfield = new Gato("macho", "romano"); 
    Gato tom = new Gato("macho");
    Gato lisa = new Gato("hembra");
    Gato silvestre = new Gato();
    System.out.println("El sexo de garfield es: " + garfield.getSexo());
    System.out.println("El sexo de tom es: " + tom.getSexo());
    System.out.println("El sexo de lisa es: " + lisa.getSexo());
    System.out.println("El sexo de silvestre es: " + silvestre.getSexo());
    Ave miLoro = new Ave(); 
    miLoro.aseate(); 
    miLoro.vuela();
    Pinguino pingu = new Pinguino("hembra"); 
    pingu.aseate();
    pingu.vuela();
    } 
}

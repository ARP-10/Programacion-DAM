package Ejemplo1;

/**
 * Ave.java
 * Definición de la clase Ave
 */
public class Ave extends Animal {
    public Ave(String s) { 
        super(s);
    }
    public Ave() { 
        super();
    }
    /**
    * Hace que el ave se limpie.
    */
    public void aseate() {
        System.out.println("Me estoy limpiando las plumas");
    }
    /**
     * Hace que el ave levante el vuelo.
     */
    public void vuela() { 
        System.out.println("Estoy volando");
    } 
}


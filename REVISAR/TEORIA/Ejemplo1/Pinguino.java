package Ejemplo1;

/**
 * Pinguino.java
 * Definición de la clase Pinguino
 */
public class Pinguino extends Ave {
    public Pinguino() { 
        super();
    }
    public Pinguino(String s) { 
        super(s);
    }
    /**
    * El pingüino no puede volar.
    */
    @Override
    public void vuela() { 
        System.out.println("No puedo volar");
    } 
}


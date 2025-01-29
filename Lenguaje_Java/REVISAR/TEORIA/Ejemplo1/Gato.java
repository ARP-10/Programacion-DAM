package Ejemplo1;

/**
 * Gato.java
 * Definición de la clase Gato
 */
public class Gato extends Animal { 
    private String raza;
    public Gato () { 
        super("Hembra"); 
        raza = "siamés";
    }
    public Gato (String s) { 
        super(s);
        raza = "siamés";
    }
    public Gato (String s, String r) { 
        super(s);
        raza = r;
    }
    /**
     * Hace que el gato maulle.
     */
    public void maulla() { 
        System.out.println("Miauuuu");
    }
    /**
     * Hace que el gato ronronee
     */
    public void ronronea() { System.out.println("mrrrrrr");
    }
    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     *
     * @param comida la comida que se le ofrece al gato
     */
    public void come(String comida) { 
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias"); 
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }
}

package Unidades_6_7_8.Ejemplos;
/**
 * Definición de la clase Gato
 * @author
 */
public class Gato {
    // Atributos
    String color, raza, sexo; int edad;
    double peso;
    // Métodos
    // Constructor
    Gato (String s) { 
        this.sexo = s;
    }
    // Getter
    String getSexo() { 
        return this.sexo;
    }
    /**
    * Hace que el gato maulle
    */
    void maulla() { 
        System.out.println("Miauuuu");
    }
    /**
    * Hace que el gato ronronee
    */
    void ronronea() { 
        System.out.println("mrrrrrr");
    }
    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     *
     * @param comida la comida que se le ofrece al gato
     */
    void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias"); 
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public static void main(String[] args) {
        Gato garfield = new Gato("macho");
        System.out.println("Hola Garfield");
        garfield.maulla();
        System.out.println("Toma tarta");
        garfield.come("tarta selva negra");
        System.out.println("Toma pescado, a ver si esto te gusta");
        garfield.come("pescado");
        Gato tom = new Gato("macho"); 
        tom.come("sopa de verduras");
        Gato lisa = new Gato("hembra");
        garfield.maulla();
        tom.maulla();
        lisa.maulla();
        }
}

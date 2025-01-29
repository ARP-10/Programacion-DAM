package EjerciciosInternet;

public class Persona {
    
    /* Crear una clase Persona que tenga 4 variables:
            - 1 tipo int
            - 2 tipo String
            - 1 tipo double
        Crear dos métodos
            - tipo String: nombreCompleto(), que concatene el noombre completo y lo retorne
            - tipo void: presentarse(), que muestre en pantalla un mensaje de presetnación personal.
        Crear la clase principal con el método main()
        Crear dos objetos
        Desplegar la presentación de los dos objetos 
    */
    
    //Atributos
    int edad;
    String nombre, apellido;
    double estatura;

    //Constructores
    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.apellido = "";
        this.estatura = 0.0;
    }

    public Persona (int edad, String nombre, String apellido, double estatura){
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    //Métodos
    public String nombreCompleto() {
        //String nombreCompleto = nombre + " " + apellido;    
        return nombre + " " + apellido;
    }

    public void presentarse() {
        System.out.println("Hola mi nombre es " + nombreCompleto() + " mi estatura es " + estatura + "m y tengo " + edad + " años. Mucho gusto!");

    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Ale";
        persona1.apellido = "RP";
        persona1.edad = 25;
        persona1.estatura = 1.70;

        persona1.presentarse();

        Persona persona2 = new Persona(28, "Benji", "MG", 1.70);
        persona2.presentarse();
    }
}

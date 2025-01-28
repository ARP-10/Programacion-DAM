package Dependencia.Ejemplo1;

public class Gato extends Animal {
    //Atributos
    private String raza;

    //Constructores
    public Gato() {
        super("Hembra");
        raza = "siames";
    }

    public Gato (String s) {
        super(s);
        raza = "siames";
    }

    public Gato (String s, String r) {
        super(s);
        raza = r;
    }

    //Metodos
    public void maulla() {
        System.out.println("Miauuuu");
    }

    public void ronronea() {
        System.out.println("Prrrrr");
    }

    public void come (String comida) {
        if (comida.equals("pescado")){
            System.out.println("Mmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }

    }
}

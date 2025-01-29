package Dependencia.Ejemplo1;

public class Ave extends Animal {
    
    public Ave (String s) {
        super(s); //Llama a los constructores de la clase padre (Animal)
    }

    public Ave() {
        super();
    }

    public void aseate() {
        System.out.println("me estoy limpiando las alas");
    }

    public void vuela() {
        System.out.println("Estoy volando");
    }
}

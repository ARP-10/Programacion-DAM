package Dependencia.Ejemplo1;

//Animal.java -> Definicion de la clase Animal

public class Animal {
    
    private String sexo;
    
    public Animal() {
        this.sexo = "Hembra";
    }

    public Animal(String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void duerme() {
        System.out.println("ZzzZzz");
    }
}

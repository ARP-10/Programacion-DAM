package Ejemplo1;

/**
 * Animal.java
 * Definición de la clase Animal
 */
public class Animal {
    private String sexo;
    public Animal () { 
        this.sexo = "Hembra";
    }
    public Animal (String s) { 
        this.sexo = s;
    }
    public String getSexo() { 
        return this.sexo;
    }
    /**
     * Hace que el animal se eche a dormir.
     */
    public void duerme() { 
        System.out.println("Zzzzzzz");
    } 
}

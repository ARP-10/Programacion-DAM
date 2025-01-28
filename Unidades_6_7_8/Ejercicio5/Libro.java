package Unidades_6_7_8.Ejercicio5;

public class Libro extends Publicacion {
    //Atributos
    private boolean prestado = false;

    //Constructor
    public Libro(int isbn, String titulo, int anioPublicacion){
        super(isbn, titulo, anioPublicacion);
    }

    @Override
    public void presta(){
        if (this.prestado == false){
            System.out.println("Lo siento, este libro ya está prestado.");
        }else {
            this.prestado = true;
        }
    }

    @Override 
    public void devuelve(){
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado(){
        return this.prestado;
    }


    
}

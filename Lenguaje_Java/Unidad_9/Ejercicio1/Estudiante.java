package Ejercicio1;

public class Estudiante {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante (String nombre, double nota1, double nota2, double nota3){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre; //es lo mismo que poner return this.nombre
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3)/3; // o simplemente: return (nota1 + nota2 + nota3)/3;
        return media;
    }   
    
}

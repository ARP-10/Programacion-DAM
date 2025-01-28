package Dependencia.Ejemplo2;

public class Disco {
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; //Duracion total en minutos

    public Disco() {

    }

    public Disco(String autor, String titulo, String genero, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //El metodo toString sirve para hacer un Sysout de un objeto que yo he creado. Dentro puedo poner lo que quiera. En este caso, hemos puesto que imprima los atributos del objeto
    public String toString() {
        String cadena = "\n-------------------------------";
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTitulo: " + this.titulo;
        cadena += "\nGenero: " + this.genero;
        cadena += "\nDuracion: " + this.duracion;
        cadena += "\n-------------------------------";
        return cadena;
    }  

    //Quiero ver si dos objetos son iguales en tanto sus atributos sean iguales. por eso lo hacemos asi:
    public boolean equals(Disco disco) {
        return (this.autor.equals(disco.getAutor()) && this.genero.equals(disco.getTitulo()) && this.genero.equals(disco.getGenero()) && this.duracion == disco.getDuracion());
    }
    
    public static void main(String[] args) {
        Disco disco1 = new Disco("autor", "titulo", "genero", 120);
        Disco disco2 = new Disco("autor", "titulo", "genero", 120);
        System.out.println(disco1);
        System.out.println(disco1.equals(disco2)); //Necesitamos hacer esto para poder comparar objetos (equals), sino comparara posiciones de memoria, entonces siempre sera false. 
    }
}

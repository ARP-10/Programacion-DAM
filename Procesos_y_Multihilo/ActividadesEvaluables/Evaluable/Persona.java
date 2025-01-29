public class Persona extends Thread{
    private int idPersona;

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public void run() {
        int mesa = (int) (Math.random() * 5) + 1;
        int articulos = (int) (Math.random() * 3) + 1;
        Mesa.entregarArticulos(mesa, articulos);
    }
}
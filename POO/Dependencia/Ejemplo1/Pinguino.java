package Dependencia.Ejemplo1;

public class Pinguino extends Ave {
    public Pinguino() {
        super(); //llamaria primero al super de ave y luego al de Animal (es el constructor sin parametros)
    }

    public Pinguino(String s) {
        super(s);
    }

    //Estamos sobreescriviendo el metodo vuela, por eso ponemos el Override
    @Override
    public void vuela() { 
        System.out.println("No puedo volar");
    }
}

package Unidades_6_7_8.Ejemplos;
public class GatoAle {
    
    //Atributos
    String color, raza, sexo;
    int edad;
    double peso;

    //MÉTODOS

    //Constructor
    public GatoAle (String a) {
        this.sexo = a;
    }

    //Getter
    String getSexo() {
        return this.sexo;
    }

    public void maulla(){
        System.out.println("Miauuuuuuuu");
    }

    public void ronronea() {
        System.out.println("Purrrrr");
    }

    public void comer (String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("sdfuheiu, solo como pescado");
        }
    }

    public static void main(String[] args) {
        GatoAle Krontxi = new GatoAle("Hembra");
        System.out.println("Hola Krontxi");

        Krontxi.maulla();

        System.out.println("Toma tarta");
        Krontxi.comer("Tarta de queso");
        System.out.println("Toma pescado, a ver si te gusta");
        Krontxi.comer("pescado");

        GatoAle tom = new GatoAle("macho"); 
        tom.comer("sopa de verduras");

        GatoAle lisa = new GatoAle("hembra");
        Krontxi.maulla();
        tom.maulla();
        lisa.maulla();

    }
}

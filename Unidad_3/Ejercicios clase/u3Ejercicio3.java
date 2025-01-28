import java.util.Scanner;

public class u3Ejercicio3 {

    public static void main(String[] args) {

        //Dados un dividendo y un divisor, indique por pantalla si la división de ambos es exacta

        Scanner reader = new Scanner (System.in);

        double dividendo = 0.0;
        double divisor = 0.0;
        double resultado;

        System.out.println("Escribe el primer número: ");
        dividendo = reader.nextFloat();

        System.out.println("Escribe el segundo número: ");
        divisor = reader.nextInt();
        
        resultado = dividendo/divisor;

        System.out.println("La división es " + dividendo + " / " + divisor + " = " + resultado);

        reader.close();

        if (resultado <= 0){
            System.out.println("La división no es exacta");
        } else {
            System.out.println("La división es exacta");
        }
    }   
}

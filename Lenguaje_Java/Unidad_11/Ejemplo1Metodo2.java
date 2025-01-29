package Unidad_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1Metodo2 {
    public static void main(String[] args) {

        try {
            File archivo = new File("Unidad_11/datos.txt");
            Scanner sc = new Scanner(archivo);

            while(sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(" ");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                System.out.println("Nombre: " + nombre + " " + "Edad: " + edad);
            }

            sc.close();

        } catch (FileNotFoundException e){
            System.out.println("Excepcion: " + e);
        } catch (NumberFormatException e) { //Esto es para que en caso de que en vez de en edad el cliente ponga un numero, pone letras, lanza esta excepcion
            System.out.println("Excepcion: " + e);
        }
        
    }
}

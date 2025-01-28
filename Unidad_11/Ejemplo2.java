package Unidad_11;

import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Unidad_11/archivoEscribir.txt"); //Cuando creamos este objeto, el archivo este .txt no existe
            /* Respecto a la liena anterior: la primera vez que ejecutamos se crea el archivo, si hacemos algun cambio y ejecutamos de nuevo, el archivo se sobreescribe
             * si no queremos que se sobreescriba: FileWriter writer = new FileWriter("Unidad_11/archivoEscribir.txt", true);
             */
            writer.write("Primera linea\n");
            writer.write("Segunda linea");
            writer.close();
        } catch (IOException e) {
            System.out.println("Excepcion: " + e);
        }
    }
}

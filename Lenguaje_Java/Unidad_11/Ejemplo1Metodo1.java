package Unidad_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1Metodo1 {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("Unidad_11/datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes [1]);
                System.out.println("Nombre: " + nombre + " " + "Edad: " + edad);
            }

            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Excepcion: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Excepcion: " + e.getMessage());
        } catch (NumberFormatException e) { //Esta no es necesaria meterla porque hereda de RuntimeException, pero queda mas completo asi
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
    
}

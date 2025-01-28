package Unidad_11.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PromedioEdad {
    /*
     * Se tiene un archivo de texto que contiene el nombre y la edad de varias personas separados por una coma
     * en cada linea (personas.txt). Se desea crear un programa que lea unicamente las edades dela rchivo y calcule
     * el promedio de edad de las personas. Para leer el archivo crearemos un metodo estatico que devuelva un ArrayList
     * con las edades del fichero. La firma del metodo sera: 
     *          public static ArrayList<Integer> leerEdades(String nombreFichero) throws IOException
     * Utilizaremos dicho metodo en el main para posteriormente calcular el promedio de edad de las personas.
     */

     public static void main(String[] args) {
        try {
            ArrayList<Integer> edades = leerEdades("Unidad_11.Ejercicio1.personas.txt");
            int totalPersonas = edades.size();
            int sumaEdades = 0;
            for (int i=0; i<totalPersonas; i++) {
                sumaEdades += edades.get(i); 
            }
            System.out.println("El promedio de edades del fichero es: " + sumaEdades/totalPersonas);
        } catch(IOException e){
            System.out.println("Excepcion en el mail: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Excepcion en el main: " + e.getMessage());
        }
     }

     public static ArrayList<Integer> leerEdades(String nombreFichero) throws IOException {
        ArrayList<Integer> edades = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new FileReader(nombreFichero));

        String linea = "";
        while ((linea = bf.readLine()) != null) {
            String[] partes = linea.split(","); //Ana, 25 -> ["Ana", "25"];
            edades.add(Integer.parseInt(partes[1]));
        }

        bf.close();
        return edades;
     }
}

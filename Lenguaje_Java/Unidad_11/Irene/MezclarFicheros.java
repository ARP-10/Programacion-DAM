package U11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas
 * de los primeros dos ficheros mezcladas, es decir, la primera línea será
 * del primer fichero, la segunda será del segundo fichero, la tercera será
 * la siguiente del primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se
 * deben pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las
 * líneas pueden tener tamaños diferentes.
 */
public class MezclarFicheros {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso del programa: MezclarFicheros FICHERO1 FICHERO2 MEZCLA"); 
            System.exit(-1); // sale del programa
        } 
        try {
            //BufferedReader bf1 = new BufferedReader(new FileReader("U11/personas.txt")); 
            //BufferedReader bf2 = new BufferedReader(new FileReader("U11/primos.txt")); 
            BufferedReader bf1 = new BufferedReader(new FileReader(args[0])); 
            BufferedReader bf2 = new BufferedReader(new FileReader(args[1])); 
            //FileWriter bw = new FileWriter("U11/salida.txt");
            FileWriter bw = new FileWriter(args[2]);
            String linea1 = "";
            String linea2 = "";
            while ( (linea1 != null) || (linea2 != null) ) { 
                linea1 = bf1.readLine();
                linea2 = bf2.readLine();
                if (linea1 != null) { 
                    bw.write(linea1 + "\n");
                }
                if (linea2 != null) { 
                    bw.write(linea2 + "\n");
                } 
            }
            bf1.close();
            bf2.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error de lectura/escritura"); 
            System.err.println(e.getMessage());
        } 
    }
}

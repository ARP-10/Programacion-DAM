import java.util.Scanner;

public class Geografia {
    /*
     * Crea un programa que pida por pantalla cuatro provincias españolas y a continuación tres ciudades de cada una de ellas. 
     * Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada 
     * provincia y el segundo índice el número asignado a cada ciudad.

        Ejemplo de resultados que debe mostrar el programa:

            Provincia: Asturias Ciudades: Gijón Oviedo Avilés

            Provincia: Madrid Ciudades: Madrid Tres Cantos Getafe

            Provincia Galicia Ciudades: A Coruña Lugo Ourense

            Provincia: Murcia Ciudades: Lorca Cartagena Murcia
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][] geografia = new String [4][4];
        int filas = geografia.length;
        int columnas = geografia[0].length;
        
        for (int i = 0;i < filas;i++){
                System.out.print("Introduce el nombre de una provincia: ");
                geografia[i][0]=teclado.nextLine();
        }
        for (int i = 0;i < filas;i++){
            for (int j=1; j<columnas; j++){
                System.out.print("Introduce una ciudad de la provincia " + geografia[i][0] + ": ");
                geografia[i][j]=teclado.nextLine();
            }
        }

        System.out.println("La matriz resultante es: ");
        for (int i = 0;i < filas;i++){
            System.out.print("Provincia: ");
            System.out.print(geografia[i][0] + " "); 
            System.out.print("Ciudades: ");
            for (int j = 1; j < columnas; j++){
                System.out.print(geografia[i][j] + " "); 
            }
            System.out.print("\n");
        }
       teclado.close();
    }
}

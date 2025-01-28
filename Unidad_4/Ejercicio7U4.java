import java.util.Scanner;

public class Ejercicio7U4 {
    public static void main(String[] args){
        /*
         * Crear dos matrices de n filas x n columnas y sumar sus valores, los resultados se deben almacenar en otra matriz. 
         * Los valores y el tamaño (n), seran insertados por el usuario. Mostrar las matrices originales y el resultado.
         */
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Escribe el tamaño de la matriz (n): ");
        int n=teclado.nextInt();
         
        int matriz1[][]=new int[n][n];
        int matriz2[][]=new int[n][n];
         
        int resultado[][]=new int[n][n];
         
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                 
                System.out.println("Escribe el valor para la fila "+i+" y columna "+j+" de la matriz 1: ");
                matriz1[i][j]=teclado.nextInt();
                System.out.println("Escribe el valor para la fila "+i+" y columna "+j+" de la matriz 2: ");
                matriz2[i][j]=teclado.nextInt();
                 
                resultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
         
        System.out.println("Matriz 1");
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
         
        System.out.println("Matriz 2");
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[0].length;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
         
        System.out.println("Matriz resultante");
        for(int i=0;i<resultado.length;i++){
            for(int j=0;j<resultado[0].length;j++){
                System.out.print(resultado[i][j]+" ");
            }
            System.out.println("");
        }

        teclado.close();
    }
}

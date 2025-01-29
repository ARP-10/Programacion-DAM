import java.util.Scanner;

public class Ejercicio6U4 {
    /*
     * Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Introduce el número de columnas: ");
        int columnas=teclado.nextInt();
         
        int matriz[][]=new int[5][columnas];
         
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]= (int)Math.floor(Math.random()*(0-(10+1))+(10+1)); // 10 máximo, 0 mínimo. Conversión explícita a int.
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
             
        }
        teclado.close();
         
    }
    
}

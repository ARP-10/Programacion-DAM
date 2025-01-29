public class Ejercicio5U4{
    /*
     * Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla en forma de matriz.
     */
    public static void main(String[] args){
        int matriz[][]=new int[3][3];
         
        //i = filas y j = columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" ");
                 
            }
            System.out.println("");
        }
    }
}
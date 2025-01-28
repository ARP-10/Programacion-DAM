import java.util.Scanner;
 
public class Ejercicio5U5 {
    /*
     * Realiza una función recursiva que calcule la serie de Fibonacci hasta un número determinado de elementos
     * que se indicará por teclado.
     * En la secuencia numérica de Fibonacci, cada número se obtiene sumando los dos anteriores de la secuencia. 
     * Comenzando con dos unos: 1 + 1 = 2, 2+1 = 3, 3+ 2 = 5 y así sucesivamente. 1, 1, 2, 3, 5, 8, 13,...
     */
     public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          System.out.print("Introduce el número de elementos a mostrar de la serie: ");
          int limite = teclado.nextInt();
          teclado.close();
 
          for(int i = 0; i<limite; i++){
               System.out.print(funcionFibonacci(i) + ", ");
          }
     }
 
     private static int funcionFibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return funcionFibonacci(num-1) + funcionFibonacci(num-2);
     }
 
}
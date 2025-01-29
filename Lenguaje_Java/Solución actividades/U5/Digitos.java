import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
           System.out.print("Introduce un numero entero >0 ");
           num = teclado.nextInt();
        }while(num <= 0);
        System.out.println("Número de cifras: " + numeroDigitosRecur(num));     
        teclado.close();                                        
    }

    public static int numeroDigitosRecur(int n){
           if(n < 10) { 
              return 1;
           } else {
              return 1 + numeroDigitosRecur(n/10);
           }
    }
}
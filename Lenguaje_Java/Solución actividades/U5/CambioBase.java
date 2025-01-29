import java.util.Scanner;

public class CambioBase {
    /*
     * Crea un programa en Java que convierta un número en base decimal a binario. 
     * Esto lo realizará un método al que le pasaremos el numero entero como parámetro 
     * y devolverá un String con el numero convertido a binario.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número en base decimal entero: ");
        int num = teclado.nextInt();
        String binario = decimalBinario(num);
        System.out.println("El numero " + num + " en binario es: " + binario);
        teclado.close();
    }
   public static String decimalBinario (int numero){
        String binario = "";
        String digito;
        for(int i=numero;i>0;i/=2){
            if(i%2==1) {
                digito = "1";
            } else {
                digito = "0";
            }
            binario = digito + binario;
        }
        return binario;
    }
}
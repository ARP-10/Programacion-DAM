import java.util.Scanner;

public class u3Ejercicio8 {

    public static void main(String[] args){

        //Escribir un programa en Java que calcule si un determinado número que se pasa por teclado es primo
        
        Scanner teclado = new Scanner (System.in);

        int num;
        
        System.out.println("Escribe un número: ");
        num = teclado.nextInt();

        if(num == 2){
            
            System.out.println("El número " + num + " es primo");
        }else if (num < 2 || num % 2 == 0 ){
            
            System.out.println("El número " + num + " no es primo");
        }else {
            for(int i = 2; i < num; i++){
                
                if(num % i == 0){
                    System.out.println("El número " + num + " no es primo");
        
                    System.exit(0);
                }
            }

            System.out.println("El número " + num + " es primo");

        teclado.close();

    }
    
}

}

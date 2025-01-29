import java.util.Scanner;

public class Menu {
    /*
     * Pedir al usuario dos números por teclado y le muestre un menú con las siguientes opciones: 
     * 1. Sumar, 2. Restar, 3. Salir.
     * Para las opciones 1 y 2 se le dará el resultado pedido al usuario y se volverá a mostrar el menú.
     * Para la opción 3 el programa finaliza.
     */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
        boolean salir = false;
        int opcion = 0;

        System.out.println("Introduce el primer número entero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        int num2 = teclado.nextInt();
            
        while(!salir){
                
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
                
            switch(opcion){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2: 
                    System.out.println("La resta es: " + (num1 - num2));       
                    break;  
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("El número introducido no se corresponde con ninguna opción.");
                    break; 
                }

                teclado.close();
            }
    }
}

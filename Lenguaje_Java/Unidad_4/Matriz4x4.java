import java.util.Scanner;

public class Matriz4x4 {

    public static void main(String[] args){

        //Rellenar la matriz

        Scanner teclado = new Scanner (System.in);

        int [][] matriz = new int [4] [4];

        System.out.println("Introduce los datos de la matriz: ");

        for (int filas = 0; filas < matriz.length; filas++){ 
            for (int columnas = 0; columnas < matriz.length; columnas++){
                System.out.println("Introduzca el valor de la fila " + filas + " y columna " + columnas);
                matriz [filas] [columnas] = teclado.nextInt(); 
            }
        }

        for (int filas = 0; filas < matriz.length; filas++){ 
            for (int columnas = 0; columnas < matriz.length; columnas++){
                System.out.print("["+matriz[filas][columnas]+"]");
            }
            System.out.print("\n");
        }
        

        // Operaciones:

        int opc = 0;

        do {
            System.out.println("[1] Suma de fila");
            System.out.println("[2] Suma de columna");
            System.out.println("[3] Suma diagonal inversa");
            System.out.println("[4] Suma diagonal");
            System.out.println("[5] Salir");
            opc = teclado.nextInt();
        } while (opc < 0 || opc > 5); 
            System.out.println("El número elegido es: " + opc);
            
        

        switch(opc){
            case 1: //Suma de una fila
                int f, suma1 = 0;
                System.out.println("Ingrese la fila que desea sumar: ");
                f = teclado.nextInt();
                while (f < 0 || f > 3){ //Para validar las opciones
                    System.out.println("¡Error!, fila no válida");
                    f = teclado.nextInt();
                }
                for(int c = 0; c < 4; c++){
                    suma1 = suma1 + matriz[f][c];
                }
                System.out.println("La suma de la fila es: " + suma1);
                break;

            case 2: //Suma de una columna
                int c, suma2 = 0;
                System.out.println("Ingrese la columna que desea sumar: ");
                c = teclado.nextInt();
                while (c < 0 || c > 3){ //De nuevo, para validar las opciones
                    System.out.println("¡Error!, fila no válida");
                    c = teclado.nextInt();
                }
                for(int f1 = 0; f1 < 4; f1++){
                    suma2 = suma2 + matriz[f1][c];
                }
                System.out.println("La suma de la fila es: " + suma2);
                break; 
            
            case 3: //Suma diagonal inversa
                int suma3 = 0;
                for (int filas = 0; filas < matriz.length; filas++){ 
                    for (int columnas = 0; columnas < matriz.length; columnas++){
                        if(filas+columnas==4-1){
                            suma3 = suma3 + matriz[filas][columnas];
                        }
                    }
                }
                System.out.println("La suma de la diagonal inversa es: " + suma3);
                break;
            
            case 4: //Suma diagonal principal
                int suma4 = 0;
                for (int filas = 0; filas < matriz.length; filas++){ 
                    for (int columnas = 0; columnas < matriz.length; columnas++){
                        if(filas==columnas){
                            suma4 = suma4 + matriz[filas][columnas];
                        }
                    }
                }
                System.out.println("La suma de la diagonal es: " + suma4);
                break;              
            
            case 5: 
                System.out.println("Saliendo del programa... ");
                break;

        } while (opc>=1 && opc<6);
        

        teclado.close();
    }
    
}

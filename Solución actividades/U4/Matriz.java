import java.util.Scanner;
 
public class Matriz {
    /*
     * Crear una matriz 4×4 de números enteros inicialmente vacía. Realizar un menú con las siguientes opciones:

        1. Rellenar toda la matriz de números, el usuario ira introduciendo uno a uno los valores.
        2. Suma de una fila que se pedirá al usuario (controlar que elija una correcta).
        3. Suma de una columna que se pedirá al usuario (controlar que elija una correcta).
        4. Sumar la diagonal principal de la matriz.
        5. Sumar la diagonal inversa de la matriz.
        6. La media de todos los valores de la matriz.
       
        Hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar, 
       simplemente mostrar un mensaje donde diga que se debe rellenar la matriz.
     */
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false;
        int opcion, fila, columna;
        boolean rellenado = false;  //Utilizado para indicar si hemos entrado en la 1ª opcion
        do {
            System.out.println("Menu: ");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Suma diagonal principal");
            System.out.println("5. Suma diagonal inversa");
            System.out.println("6. Media elementos");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = teclado.nextInt();
 
            switch (opcion) {
                case 1:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[0].length; j++) {
                            System.out.println("Introduce el valor de la posicion [" + i + "][" + j + "]");
                            matriz[i][j] = teclado.nextInt();
                        }
                    }
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una fila: ");
                            fila = teclado.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        
                        int suma = 0;
                        for (int j = 0; j < matriz[0].length; j++) {
                            suma += matriz[fila][j];
                        }
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + suma);    
                    } else {
                        System.out.println("Debes rellenar la matriz primero, opción 1.");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una columna: ");
                            columna = teclado.nextInt();
 
                        } while (!(columna >= 0 && columna < matriz.length));
 
                        int suma = 0;
                        for (int i = 0; i < matriz[0].length; i++) {
                            suma += matriz[i][columna];
                        }
                        System.out.println("La suma de los valores de la columna " + columna + " es: " + suma); 
 
                    } else {
                        System.out.println("Debes rellenar la matriz primero, opción 1.");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        int suma = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j =0; j < matriz[0].length; j++){
                                if (i==j){
                                    suma += matriz[i][j];
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal principal es: " + suma);
                    } else {
                        System.out.println("Debes rellenar la matriz primero, opción 1.");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        int suma = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = matriz[0].length -1; j >= 0; j--){
                                if(i + j ==matriz.length - 1){
                                    suma += matriz[i][j];
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal inversa es: " + suma);
                    } else {
                        System.out.println("Debes rellenar la matriz primero, opción 1.");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        int suma = 0;
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[0].length; j++) {
                                suma += matriz[i][j];
                            }
                        }
                        System.out.println("La media de los valores de la matriz es: " + suma/(matriz.length * matriz[0].length));
                    } else {
                        System.out.println("Debes rellenar la matriz primero, opción 1.");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no es válida.");
            }
        } while (!salir);
        teclado.close();
    }
}
import java.util.Scanner;

public class Unidad5 {
    public static void main(String[] args) {

        //FUNCIONES
        Scanner teclado = new Scanner(System.in);
        int filas = 3;
        int columnas = 3;
        int [][] m = new int [filas][columnas];
        int [][] m2 = new int[filas][columnas];

            //Rellenamos la matriz utilizando una funcion -> la identificare como funcion 1
            /*for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Escribe un numero en la posicion [" + i + "][" + j + "]");
                    m[i][j] = teclado.nextInt();
                }
            }*/

        rellenarMatriz(m, teclado); //m es el nombre que le he dado a mi martiz en el main, y teclado el nombre de mi teclado en el main
        rellenarMatriz(m2, teclado);

            //Mostramos la matriz -> La identificare como funcion 2
        for (int i=0; i<filas; i++) {
            for (int j=0; j<filas; j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println("");
        }

        teclado.close();

        //Cogiendo el ejemplo de la funcion que retoirna algo de abajo:
        //Primero creamos las variables que queremos usar en la funcion
        int n1 = 2; //En este caso las variables de la funcion y las del main se llaman igual, pero no tiene porquye ser necesariamente asi
        int n2 = 4;
        boolean n1Mayor = mayor(n1, n2);
        System.out.println(n1Mayor);


        //RECURSIVIDAD

        //Factorial de un número

        //Aquí imprimimos lo de abajo

        System.out.println(factorialRecur(5));
        System.out.println(sumaDigitosRecur(1234));
        System.out.println(invertirPalabra("hola"));

    } 
    
    //Funcion 1
    public static void rellenarMatriz(int[][] matriz, Scanner sc){ //A Scanner hay que ponerle un nombre
        for (int i = 0; i < matriz.length; i++) { //Usamos el .length para que sea una funcion generica que se pueda usat mas veces
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Escribe un numero en la posicion [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt(); //sc porque es el nombre que le hemos dado a Scanner en esta funcion
            }
        }
    }

    //Ejemplo de una funcion que queremos que devuelva algo:
    public static boolean mayor (int n1, int n2) {
        return n1>n2;
    }
    
    public static int factorial (int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }

        return fact;
    }

    //Vamos a hacer la misma función pero de forma recursiva

    public static int factorialRecur (int num) {
        if (num == 0) {
            return 1;
        } else {
            return num*factorialRecur(num-1);
        }
    }

    /* Aquí cuando mi num no sea 0, continúa por el else y si el numero factorial es 5, 
    le va a restar 1 :

    En orden JAVA va a hacer:
    
    5 * factorialRecur(4);      = 24 -> 120 
    4 * factorialRecur(3);      = 6
    3 * factorialRecur(2);      = 2
    2 * factorialRecur(1);      = 1
    1 * factorialRecur(0);      = 1 después hace estos cálculos de aquí de abajo a arriba
    1;
    */

    public static int sumaDigitos (int num){ //Ej. num = 1234
        int suma = 0;

        while (num>0){
            suma += (num % 10); // suma = 4 (1234 % 10 -> resto división entre 10)
            num /= 10; //123 . Cada vez que divide entre 10 le quita un número. Es como pasar las comas pero aquí hay numeros enteros
        }

        return suma;
    }

    //Hacemos la función anterior de forma recursiva:

    /* 1234
       4 + 123
       123 = 3 + 12
       12 = 2 + 1
       1 */

    public static int sumaDigitosRecur (int num) {
        if (num < 10){
            return num;
        } else {
            return num % 10 + sumaDigitosRecur(num/10);
        }
   }   

   //Lo que hace esta función es:

   /* num = 1234
        sumadigitosRecur(1234)          = 10
        4 + sumadigitosRecur(123)       = 6
        3 + sumadigitosRecur(12)        = 3
        2 + sumadigitosRecur(1)         = 1
        1
    */

    //Vamos a invertir una palabra

    public static String invertirPalabra(String cadena){
        if (cadena.length()==1){
            return cadena;
        }else {
            return invertirPalabra(cadena.substring(1)) + cadena.charAt(0);
        }
    }
    
}
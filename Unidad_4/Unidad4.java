import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner; 

public class Unidad4{

    public static void main(String [] args) {   

        //Caracteres simples, entre comillas simples

        //Character es una librería. .isDigit() comprueba el último dígito
        Character.isDigit('2'); //Devolverá true, porque 2 es un dígito numérico

        Character.isDigit('A'); //Devolverá false porque A no es un dígito numérico

        //Determina si el carácter insertado está en mayus. Devuelve true o false
        Character.isUpperCase('A'); //Devolverá true porque A está en mayus

        Character.isLowerCase('a'); //true porque a está en minus

        char caracterMinusculas = Character.toLowerCase ('A'); //Guarda en la variable la letra 'a' ('A' en minúsculas)
        System.out.println(caracterMinusculas);



        /*Random es otra líbería, con ella podemos crear un objeto (en este caso un número aleatorio). 
        Hay que importar el 2do Random, se pulsa en la bombilla y le damos import java.util */
        Random semilla = new Random();
        //Ahora, si queremos crear un número aleatorio:
        float num = semilla.nextFloat();
        System.out.println(num);
        //Todo lo que esté en java.lang está ya en java. Es como la librería básica. Ej. Math. no hay que importarlo porque ya está ahí. 
        double num2 = Math.random();
        System.out.println(num2);
        //Si quiero que me de valores entre el 0 y el 10. Si quiero que incluya el 10 : * 10 + 1;
        double num3 = Math.random()*10;
        System.out.println(num3);
        //Si quiero que me de números enteros:
        double num4 = Math.floor(Math.random()*10+1);
        System.out.println(num4);

        Math.pow(caracterMinusculas, num4); //Retorna la base y el exponente y lo calcula. Ej Math.pow(7, 2); = 49



        //Fechas con la librería Date
        Date hoy = new Date();
        System.out.println(hoy);
        //Podemos formatearlo para que no quede tan feo
        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        System.out.println(formato.format(hoy)); 



        //ARRAY. Son estructuras estáticas. Si abro un array que es int, siempre es int, y si tiene 5 posiciones siempre tendrá 5 posiciones
        int[] arrayEnteros = {1,2,3,4,5}; //Esta es una forma de inicializar un array, se usa esto cuando se qué valores va a contener y la de abajo cuando le damos al usuario la opción de insertarlos
        int[] array = new int [5]; //Aquí "array" puede llamarse como queramos

        System.out.println(arrayEnteros[3]); //Le estamos diciendo que imprima la posición 3 

        Scanner teclado = new Scanner (System.in);

        for (int i=0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posición " + i); 
            array [i] = teclado.nextInt(); //Para asociar lo que me da el usuario con el array. 
        }
        //Para escribir por pantalla volvemos a hacer otro bucle
        for (int j = 0; j < array.length; j++) {
            System.out.print("(" + array [j] + " )");
        }
            

        //MATRICES. Es como un array de arrays. Casi como un excel

        int [][] matriz = new int [2] [2]; //Matriz creada sin elementos
        int [][] matriz2 = {{8,2},{1,3}}; //Matriz con elementos

        System.out.println(matriz2);

        for (int fila = 0; fila < matriz.length; fila++){ //como para cada fila necesitamos una columna, creamos otro bucle
            for (int columnas = 0; columnas > matriz [0].length; columnas++){
                System.out.println("Introduzca el valor de la fila " + fila + " y columna " + columnas);
                matriz [fila] [columnas] = teclado.nextInt(); //Aquí asociamos los valores
            }
        }

        //Si queremos que nos de valores sin insertarlos
        for (int fila = 0; fila < matriz.length; fila++){ 
            for (int columnas = 0; columnas > matriz [0].length; columnas++){
                System.out.println("["+matriz[fila][columnas]+"]");
            }
            System.out.println("\n"); //Esto es para insertar un espacio y que se vea en 4x4 por ejemplo

        }

        //CADENAS DE STRING
        String cadena = ""; //por defecto es null

        //Comparamos dos datos primitivos
        int num11 = 2;
        int num22 = 3;
            //num11 == num22 = false -> los tipos primitivos no se comparan con ==

        int[] array1 = new int[3]; //Cuando Java lee un operador "new" le asigna memoria. Por eso, si hacemos System.out.println(array1); e; resultadop sera = 1bc123, que es el es lugar de la memoria
           //Si hacemos -> array == array1; no funcionara, porque comprara posiciones de memoria
        
        System.out.println(cadena + num11 + num22 + array1);//ESTO ES SOLO PARA QUE NO DE ERROR


        //String es un tipo especial de objeto:
        String sentencia1 = "Hola"; //No uso new
        String sentencia2 = "Hola";
        System.out.println(sentencia1==sentencia2); //Dira que es verdadero. Compara dos variables de tipo primitivo
        String sentencia3 = new String ("Hola");
        System.out.println(sentencia1==sentencia3); //Dira que es falso, ya que compara un tipo primitivo con un objeto (new)

            //Por tanto, para comparar String, utilizamos el metodo equals
        System.out.println(sentencia1.equals(sentencia3)); //Dira que es true   

        System.out.println(sentencia1.length());
        System.out.println(sentencia1.charAt(2)); //Nos dice el caracter que corresponde a esa posicion 
        System.out.println(sentencia1.indexOf("k")); //Como no va a encontrar este caracter, el resultado sera -1
        System.out.println(sentencia1.substring(1, 3)); //El resultado sera ol. Coge la posicion 1 bien, pero en vez de la 3 coge la 2
        System.out.println(sentencia1.toUpperCase());
        System.out.println(sentencia1.toLowerCase());
        System.out.println(sentencia1.trim()); //Elimina espacios en blanco
        String[] cadenaSplit = sentencia1.split("o"); //Nos devuelve un array. Imaginemos que sentencia1 = "Hola que tal";
        System.out.println(cadenaSplit[1]); //Crea un array en el que nos separa el String por lo que nosotros le pongamos. En este caso imprime: la que tal. Lo que hace es quitar la o -> "H" "la que tal" 
        System.out.println(sentencia1.concat(sentencia2)); //Concatena sentencias sin anadir espacios


        teclado.close();

    }
}
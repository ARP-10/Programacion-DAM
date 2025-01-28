//import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class Unidad2
{
    public static void main(String[] args){
     
        //Variable: constante -> SNAKE_CASE
        final String SALUDO_INGLES = "Hello";
        final String SALUDO_FRANCES = "Bonjour";
        //Variable: dinámica -> lowerCamelCase
        String nombreSaludo = "Alejandra";
        System.out.println(SALUDO_INGLES + " " + nombreSaludo + " !");

        //Damos otro valor a la variable dinámica
        nombreSaludo = "Benjamin";
        System.out.println(SALUDO_FRANCES + " " + nombreSaludo + " !");

        //Utilizar enum. El enum se pone fuera del main
        System.out.println("Hoy es: "+ Dias.LUNES);

        /*Casting
         * Casting implícito: pasar de una variable que ocupa poca memoria a una que ocupa mucha. "automático"
         * byte -> short -> char -> int -> long -> float -> double*/
        int numeroEntero = 100; //4 bytes
        long numeroEnteroLargo = numeroEntero; //8 bytes

        //Casting explícito: pasar de una que ocupa mucho a una que ocupa poco. ERROR por eso hay que hacer casting explícito. "no automático"
        short numeroEnteroShort = (short) numeroEntero; 
        System.out.println("numeroEntero: " + numeroEntero);
        System.out.println("numeroEnteroLargo: " + numeroEnteroLargo);
        System.out.println("numeroEnteroShort: " + numeroEnteroShort);

        //Conversión de float, double a int
        double numeroDouble = 4.6;
        System.out.println("Resultado utilizando round: " + Math.round(numeroDouble));
        System.out.println("Resultado utilizando ceil: " + Math.ceil(numeroDouble));
        System.out.println("Resultado utilizando floor: " + Math.floor(numeroDouble));

        //Conversión entre char e int
        int numeroInt;
        char valorCaracter;

        numeroInt = (int) 'A';
        System.out.println("El carácter A a int es: " + numeroInt);
        valorCaracter = (char) 68;
        System.out.println("El int 68 a char es: " + valorCaracter);

        //Convertir String a los distintos tipos
        String cadena = "49";
        byte cadenaByte = Byte.parseByte(cadena);
        short cadenaShort = Short.parseShort(cadena);
        int cadenaInt = Integer.parseInt(cadena);
        double cadenaDouble = Double.parseDouble(cadena);
        
        System.out.println("La cadena de caracteres: " + cadena + " a byte es: " + cadenaByte);
        System.out.println("La cadena de caracteres: " + cadena + " a short es: " + cadenaShort);
        System.out.println("La cadena de caracteres: " + cadena + " a int es: " + cadenaInt);
        System.out.println("La cadena de caracteres: " + cadena + " a byte es: " + cadenaDouble);

        //Es posible hacer divisiones entre double e int
        double num;
        double num1 = 2.45;
        int num2 = 2;
        num = num1/num2;
        System.out.println(num);

        
    }

    enum Dias{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    
}
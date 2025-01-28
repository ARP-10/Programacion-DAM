public class Ejercicio2 {
    /*
     * Definir el programa en Java necesario para intercambiar los valores de dos variables numéricas.
     */
    public static void main (String[] args){
        int num1 = 4;
        int num2 = 8;
        System.out.println("La primera variable tiene valor " + num1 + " y la segunda variable " + num2);
        // Opción 1: Intercambiamos los valores utilizando una variable auxiliar.
        int aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("La primera variable tiene valor " + num1 + " y la segunda variable " + num2);

        // Opción 2: utilizando operaciones elementales.
        int num11 = 4;
        int num22 = 8;
        System.out.println("La primera variable tiene valor " + num11 + " y la segunda variable " + num22);
        num11 = num11 + num22;
        num22 = num11 - num22;
        num11 = num11 - num22;
        System.out.println("La primera variable tiene valor " + num11 + " y la segunda variable " + num22);
    }
}
public class Ejercicio1 {
    /*
     * Escribir un programa en Java que, dados 2 números con decimales, 
     * muestre por pantalla la suma, resta, multiplicación, división y módulo de los mismos.
     */
    public static void main (String[] args){
        double num1 = 5.24;
        double num2 = 138.104;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + (num1 * num2));
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + (num1 % num2));
    }
}
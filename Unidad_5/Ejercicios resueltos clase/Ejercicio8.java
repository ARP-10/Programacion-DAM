//EJERICIO SIMILAR AL DEL MORSE

/*Crea una función con la siguiente cabecera:
 *  public String convierteEnPalabras(int n)
 * 
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todos en una cadena de caracteres. 
 * 
 * Por ejemplo, el 470213 convertido a palabras sería:
 * cuatro, siete, cero, dos, uno, tres
 * 
 * Utiliza esta función en un programa para comprobar que funciona bien.
 * 
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. 
 * Fíjate que hay una coma detrás de cada palabra salvo al final.
 */

 public class Ejercicio8 {

    public static void main(String[] args) {

        System.out.println(convierteEnPalabras(470213));
        
    }

    public static String convierteEnPalabras(int n) { 

        String[] digitos = {
            "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
        };

        String resultado = digitos[n%10]; //Hacemos una primera iteración
        n = n/10; //Esto es para quitar la coma

        while (n > 0) {
            int resto = n % 10; //123
            resultado = digitos[resto] + ", " + resultado; // 3. Es importante el orden para que el resultado no sea el número del revés. 
            n = n/10; // 12. Utilizamos esto para que no sea un bucle infinito. 
        }

        return resultado;
    }

 }
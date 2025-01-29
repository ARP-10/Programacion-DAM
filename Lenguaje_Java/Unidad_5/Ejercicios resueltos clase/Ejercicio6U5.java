public class Ejercicio6U5 {
    /* 
     * Crea una función recursiva que invierta un número entero dado.
     */
    public static void main(String[] args) {
        int numero = 1234;
        invertir(numero);
        invertirNum(numero, Integer.toString(numero).length() - 1);
    }
    /* Método que dado un número, lo imprime por pantalla invertido
     * Ejemplo: n = 1234 -> 4321
     */ 
    public static void invertir(int n) {
        if(n<10) {
            System.out.print(n);
        }
        else{
            System.out.print(n%10);
            invertir(n/10);
        }
    }

    /*
     * Otra opción: necesitamos saber el número de cifras menos uno para poder multiplicar por 10^n e ir
     * "moviendo" el último dígito hasta el primero (como hicimos en la Unidad 3)
     */
    public static int invertirNum(int num, int pos){
        // Si es menor que 10 devuelvo el numero (el ultimo dígito)
        if(num < 10){
            return num; 
        }else{
            // Cojo el modulo del numero y lo multiplico por 10^3 así: 4*1000 + invertirNum(123, 2)
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
        }
         
    }
}

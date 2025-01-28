public class Ejercicio4U5 {
    /*
     * Crea una función recursiva que calcule el resultado de un número elevado a otro.
     */
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        System.out.println(base + " elevado a " + exponente + " = " + poten(base, exponente));
    }
    /*
     * Función que devuelve el primer número pasado como parámetro elevado al segundo
     * Ejemplo: base = 2 y exp = 4 -> return 4
     */
    public static int poten(int base, int exp){
        if(exp==0) { // Cualquier número elevado a cero es 1
            return 1; 
        }
        else if(exp==1) {
            return base;
        }
        else {
            return base * poten(base,exp-1);
        }
    }
}

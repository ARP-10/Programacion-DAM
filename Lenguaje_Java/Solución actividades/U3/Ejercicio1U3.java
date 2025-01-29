public class Ejercicio1U3 {
    /*
     * Escribir por pantalla los números del 1 al 100 que sean impares
     */
    public static void main (String[] args){
        final int INICIO=1;
        final int FINAL=100;
        System.out.println("Los números impares entre el " + INICIO + " y el " + FINAL + " son: ");
        for (int i = INICIO; i <= FINAL; i = i +2){
            System.out.println(i);
        }
    }
}
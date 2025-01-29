public class Ejercicio4 {
    /*
     * Diseñar un programa en Java que convierta una cantidad positiva de segundos, a su equivalente en horas, minutos y segundos.
     */
    public static void main (String[] args){
        final int SEGUNDOS_EN_UNA_HORA=3600;
        final int SEGUNDOS_EN_UN_MINUTO=60;

        int segundos = 123456;

        int cantidadHoras = segundos/SEGUNDOS_EN_UNA_HORA;
        int restoHoras = segundos%SEGUNDOS_EN_UNA_HORA;
        int cantidadMinutos = restoHoras/SEGUNDOS_EN_UN_MINUTO;
        int restoMinutos= segundos%SEGUNDOS_EN_UN_MINUTO;
            
        System.out.println(segundos + " segundos equivalen a " + cantidadHoras + "h "  + cantidadMinutos + "' " + restoMinutos + "\"");
    }
}

package Ejercicio2;

/* Una empresa quiere implementar un programa que lleve el control de las incidencias
 * que se producen en sus ordenadores. 
 * 
 * Cada incidencia tiene un código: 1, 2, 3, 4, etc. Cuando se crea una nueva incidencia, 
 * se le asigna un código de forma automática y se pone el estado como "pendiente".
 * 
 * Al crear una incidencia hay que indicar el número de pueso en el que ocurre la incidencia 
 * (un número entero) y el motivo.
 * 
 * Cuando se resuelve una incidencia, hay que proporcionar información sobre cómo se ha resuelto 
 * o qué es lo que fallaba, además, el estado pasa a "resuelta".
 * 
 * El siguienre trozo de código que va dentro del main genera la salida que se muestra a continuación:
 * 
 * Incidencia inc1 = new Incidencia (105, "No tiene acceso a internet");
 * Incidencia inc2 = new Incidencia (14, "No arranca");
 * Incidencia inc3 = new Incidencia (5, "La pantalla se ve rosa");
 * Incidencia inc4 = new Incidencia (237, "Hace un ruido extraño");
 * Incidencia inc5 = new Incidencia (111, "Se cuelga al abrir 3 ventanas");
 * 
 * inc2.resuelve("El equipo no estaba enchufado");
 * inc3.resuelve("Cambio del cable VGA");
 * System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
 * 
 * Salida:
 * Incidencias pendientes: 3
 * 
 */
public class Incidencia {
    
    //Atributos
    private int codigo;
    private String estado;
    private int puesto;
    private String solucion;
    private String motivo;
    private String resolucion;

    private static int contadorCodigos = 0;
    private static int pendientes = 0;

    //Constructor
    public Incidencia (int puesto, String motivo) {
        this.puesto = puesto;
        this.motivo = motivo;
        this.codigo = contadorCodigos++;
        this.estado = "Pendiente";
        pendientes++;
    }

    //Métodos
    public void resuelve(String motivo) {
        this.resolucion = motivo;
        this.estado = "Resuelta";
        pendientes--;
    }

    //Getters - setters
    public String getEstado() {
        return estado;
    }

    public static int getPendientes() {
        return pendientes;
    }


    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia (105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia (14, "No arranca");
        Incidencia inc3 = new Incidencia (5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia (237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia (111, "Se cuelga al abrir 3 ventanas");
    
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
       
    }
}

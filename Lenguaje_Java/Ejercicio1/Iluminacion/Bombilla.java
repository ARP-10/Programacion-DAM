package Ejercicio1.Iluminacion;

public class Bombilla {
    
    /*Java solo permite tener una clase public por fichero, de modo que
    * si queremos acceder a los objetos que creemos desde otro fichero, lo mejor
    * será crear un fichero para cada clase.
    */

    //Atributos. Variables de instancia
    //Los atributos tienen que ser siempre private
    private String estado;

    //Variables de clase / atributos estáticos
    public static int numBombillas = 0;
    public static int numBombillasEncendidas = 0; //Son variables comunes a todas las clases. Entonces en este ejemplo, cada vez que cree una bombilla me va a sumar 1. Esto lo conseguimos añadiendo static 

    //Constructores
    public Bombilla() {
        this.estado = "Apagada";
        numBombillas++;
    }
    
    //Métodos de instancia
    public void encender() {
       this.estado = "Encendida";
       numBombillasEncendidas++;
    }
    
    public void apagar() {
        this.estado = "Apagada";
    }

    //Métodos de clase
    public static int getBombillasEncendidas() {
        return numBombillasEncendidas;
    }

    //Getters y setters
    //Los getters no reciben nada, pero sí van a retornar el valor
    public String getEstado() {
        return estado;
    }
    /*Si el atributo es public, podemos ver en este caso el Estado así -> Sysout(bombilla.estado);
     * En cambio si es private (tiene que serlo), podemos verlo así -> Sysout(bombilla.getEstado());
     */

    //Los setters son void, porque no van a retornar nada, solo//setteamos modificamos el valor
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /*Aquí lo mismo, si el atributo es public -> bombilla.estado = estado;
     * Si es private -> bombilla.setEstado (estado);
     */
    
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        bombilla1.apagar();
        System.out.println(bombilla1.estado);

        Bombilla bombilla2 = new Bombilla();
        bombilla2.numBombillas++; //Esta advertencia también le salía a la profe
        System.out.println(bombilla1.numBombillas);

        //Utilizamos los métodos
        Bombilla.getBombillasEncendidas();
        bombilla1.getBombillasEncendidas();
    }
}

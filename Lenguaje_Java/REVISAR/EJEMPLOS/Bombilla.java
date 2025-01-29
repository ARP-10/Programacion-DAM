//PROGRAMACIÓN ORIENTADA A OBJETOS

public class Bombilla {
    //Constructor. Siempre se tiene que llamar igual que la clase
    public Bombilla() {
        estado = "Apagada";
    }

    public Bombilla(String estado){
        this.estado = estado; //Cuando nos queremos referir a un atributo de nuestro objeto, utilizamos this. . this.estado se refiere al estado del primer constructor y el = estado se refiere al que hemos puesto en el segundo construcor e inicializado en bombilla3 
    }

    //Atributos
    String estado;

    //Métodos. Con los métodos, voy a trabajar sobre mis atributos
    public void encender() {
        this.estado = "Encendida";
    }

    public void apagar() {
        if (estado == "Apagada"){
            System.out.println("La bombilla ya estaba apagada");
        } else {
            this.estado = "Apagada";   
        }
    }


    public static void main (String[] args) { //Creamos el objeto bombilla
        Bombilla bombilla1 = new Bombilla(); //Instanciamos el objeto. Le asignamos un espacio de memoria
        Bombilla bombilla3 = new Bombilla("encendida"); //Sobrecarga de coonstructores


        bombilla1.encender(); //Son los métodos que he creado
        bombilla1.apagar();

        System.out.println("El estado de mi bombilla es: " + bombilla1.estado);
        System.out.println("El estado de mi bombilla es: " + bombilla3.estado);

        Bombilla bombilla2 = bombilla1; //Cambiamos que todas las bombilla2 hagan lo que hacen bombilla1. Utilizan el mismo espacio de memoria
        bombilla2.encender(); //Al encender bombilla2, encendemos la bombilla1

        
    }

}

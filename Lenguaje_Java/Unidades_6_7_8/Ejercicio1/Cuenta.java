package Unidades_6_7_8.Ejercicio1;
public class Cuenta {
    
    /* Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
     *      Titular
     *      Cantidad
     * Crea un constructor por defecto que inicialice ambos atributos y otro que asigne ambos valores que se le pasan por parámetro. 
     * Crea los siguientes métodos:
     *      ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
     *      retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0. 
    */

    //Atributos
    String titular;
    double cantidad;

    //Constructores
    public Cuenta() { //Constructor por defecto
        this.titular = "";
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) { //Vamos a hacer que el usuario introducza los datos
        this.titular = titular; 
        this.cantidad = cantidad;
    }

    //Metodos
    public void ingresar(double cantidad){
        if (cantidad > 0) { 
            this.cantidad = cantidad;
        }  
    }

    public void retirar (double cantidad) {
        if ((this.cantidad - cantidad) < 0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    public static void main(String[] args) {
        //Creamos los objetos
        Cuenta cuenta1 = new Cuenta(); //Este llama al primer constructor
        Cuenta cuenta2 = new Cuenta("Irene", 300); //Este llama al segundo constructor

        //Una vez creado todo, lo utilizamos
        cuenta1.ingresar(400);
        cuenta2.retirar(400);
        System.out.println("Dinero cuenta 1: " + cuenta1.cantidad);
        System.out.println("Dinero cuenta 2: " + cuenta2.cantidad);
    }

}

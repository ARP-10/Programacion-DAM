import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        
        //Crear un Arraylist vacio
        ArrayList<String> nombres = new ArrayList<String>();

        //Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Pedro");

        //Verificar si el ArrayList esta vacio
        System.out.println("El ArrayList esta vacio? " + nombres.isEmpty()); 

        //Obtener el tamano del ArrayList
        System.out.println("Tamano del ArrayList: " + nombres.size());

        //Verificar si el ArrayList contiene un elemento especifico
        System.out.println("El ArrayList contiene a 'Juan'? " + nombres.contains("Juan"));

        //Eliminar un elemento del ArrayList
        nombres.remove("Pedro");

        System.out.println("Tamano del ArrayList: " + nombres.size());
        System.out.println(nombres);

        //Limpiar todos los elementos del ArrayList
        nombres.clear();

        //Verificar si el ArrayList esta vacio despues de limpiarlo
        System.out.println("El ArrayList esta vacio? " + nombres.isEmpty());

        System.out.println(nombres);
    }

}
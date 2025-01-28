package Dependencia;

//No tengo que hacer import porque el fichero Mensajes.java esta en el mismo directorio que este fichero
public class Dependencia {
    public static void main(String[] args) {
        muestraVariosMensajes();
    }
    
    //Relacion de dependencia
    public static void muestraVariosMensajes() {
        //Creamos un objeto de una clase dentro del metodo de otra clase:
        Mensajes m = new Mensajes();
        m.Info("Mensaje de info");
        m.Alerta("Mensake de alerta");
        m.Error("Mensaje de error");
    }
    
}


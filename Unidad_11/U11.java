package Unidad_11;

import java.io.File;

public class U11 {
    public static void main(String[] args) {

        File archivo = new File("datos.txt");
        System.out.println(archivo.getAbsolutePath()); //poniendo archivo. vemos todas las opciones que podemos hacer. En este caso estamos viendo el path absoluto del fichero
    }
}

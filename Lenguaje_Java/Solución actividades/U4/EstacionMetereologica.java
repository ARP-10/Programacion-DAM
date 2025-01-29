import java.util.Random;
import java.util.Scanner;

public class EstacionMetereologica{
    /*
     * En una estación meteorológica se registra la temperatura (en grados centígrados) en cada hora durante el día. 
     * Almacenamos el resultado en un array de 24 elementos. 
     * Diseña un programa que muestre por pantalla un menú con las siguientes opciones y que realice las acciones que 
     * se describen: 

        a) Rellenar el vector de forma manual. 
        Esta funcionalidad permite al usuario rellenar manualmente cada uno de los 24 elementos. 

        b) Rellenar el vector de forma aleatoria. 
        Los 24 elementos del vector se rellenan de forma aleatoria, con valores entre 0 y 40. 

        c) Mostrar datos. 
        Muestra los datos almacenados en el vector.

        d) Obtener máximos y mínimos. 
        Muestra las temperaturas máxima y mínima del día, así como la hora en la que se dan. 

        e) Temperatura media. 
        Calcula la temperatura media del día. 

        f) Salir. Sale del programa.
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double [] temperaturas  = new double [24];
        String opcion = "";
        boolean salir = false;
        boolean matrizRellena = false;

        while (salir==false){
            System.out.println("a) Rellenar datos de temperatura manualmente.");
            System.out.println("b) Rellenar datos de temperatura aleatoriamente.");
            System.out.println("c) Mostrar datos de temperatura.");
            System.out.println("d) Obtener máximos y mínimos de temperatura");
            System.out.println("e) Obtener temperatura media.");
            System.out.println("f) Salir.");
            System.out.print("Elija una opción: ");
            opcion=(teclado.nextLine()).toUpperCase();
            switch (opcion){
                case "A": 
                    for (int i = 0; i< temperaturas.length; i++){
                        System.out.print("Introduce la temperatura de las " + i + " horas: ");
                        temperaturas[i]=teclado.nextDouble();
                    }
                    teclado.nextLine();
                    matrizRellena = true;
                    break;
                case "B":
                    System.out.println("Generamos aleatoriamente los datos de la temperatura.");
                    Random semilla = new Random();
                    for (int j=0; j<temperaturas.length; j++){
                        temperaturas[j]=(double)Math.round(semilla.nextDouble(41)*100)/100; // Para que genere valores entre 0 y 40. Redondeamos a 2 decimales.
                    }
                    matrizRellena = true;
                    break;
                case "C":
                    if (matrizRellena){
                        for (int i = 0; i < 24; i++){
                            System.out.println("Temperatura a las " + i + " horas : " + temperaturas[i]);
                        }
                    } else {
                        System.out.println("Debes rellenar los datos antes de elegir esta opción, usa a) o b) ");
                    }
                    break;
                case "D":
                    if (matrizRellena){
                        double maximo = temperaturas[0];
                        double minimo = temperaturas[0];
                        int indiceMaximo = 0;
                        int indiceMinimo = 0;;
                        for (int i = 0; i < temperaturas.length; i++){
                            if (maximo<temperaturas[i]){
                                maximo=temperaturas[i];
                                indiceMaximo = i;
                            }
                            if (minimo>temperaturas[i]){
                                minimo=temperaturas[i];
                                indiceMinimo = i;
                            }
                        }
                        System.out.println("Temperatura máxima: " + maximo + ". Hora: " + indiceMaximo);
                        System.out.println("Temperatura mínima: " + minimo + ". Hora: "  + indiceMinimo ); 
                    } else{
                        System.out.println("Debes rellenar los datos antes de elegir esta opción, usa a) o b) ");
                    }
                    break;
                case "E":
                    if (matrizRellena){
                        double suma = 0;
                        for (int i = 0; i < temperaturas.length; i++){
                            suma+=temperaturas[i];
                        }
                        System.out.println("Media de la temperatura del día: " + (double)Math.round((suma/temperaturas.length)*100)/100  + " grados.");
                    } else {
                        System.out.println("Debes rellenar los datos antes de elegir esta opción, usa a) o b) ");
                    }
                    break;
                case "F":
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no es correcta, introduce una de las siguientes: ");
                    break;
            }
        }
        teclado.close();
    }
}
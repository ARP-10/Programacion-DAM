package EjemploTryCatch;

public class EjemploTryCatch {
    public static void main(String[] args) {
        
        try { //Siempre que haya un try debe de haber al menos un catch o un finally
            //Codigo que podria generar una excepcion
            int a = 5/0; //Division entre cero 

            System.out.println(a); //Esta linea no la pone Irene, es para que no salga naranja

        } catch (ArithmeticException e) { //Puede haber varios catch para un unico try
                                          //Estos bloques se examinan enorden, es decir, es importante ponerlos desde la excepcion mas especifica a la mas general
                                          //Cada try, catch, finally son bloques distintos de codigo -> distinto ambito de variables
            //Bloque catch para manejar la excepcion ArithmeticException
            //Instrucciones que se ejecutaran cuando se produe una excepcion 
            System.out.println("Se ha producido un error aritmetico: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            //Bloque catch para manejar la excepcion ArrayIndexOutOfBoundsException
            System.out.println("Se ha producido un error de indice de array: " + e.getMessage());
        } catch (Exception e) {
            //Bloque catch para manejar cualquier otra excepcion, podemos usarla cuando no sabemos cual meter
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            //Bloque finally, se ejecuta siempre, aunque no haya excepcion
            System.out.println("Finalizando ejecucion del bloque try-catch");
        }

       
    }
}
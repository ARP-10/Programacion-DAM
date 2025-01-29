public class EjerciciosRecursividad {

    public static void main(String[] args){

        /*EJERCICIO 1:

        Sumar los números naturales hasta N (se lo damos nosotros) de forma recursiva*/

         int n=9;
         int resultado=sumaRecursiva(n);
         System.out.println(resultado);

        /* EJERCICIO 2:

        Factorial de un número*/

        int n2 = 5;
        int resultado2 = factorialRecursivo(n2);
        System.out.println(resultado2);

    }

    public static int sumaRecursiva(int numero) {

        int res;

        //Aquí le decimos cuándo queremos que corte
        if (numero == 1) {
            return 1;
        } else {
            res = numero + sumaRecursiva (numero-1); //Aquí nos hace 9 + el recursivo de 8 
        }

        return res;
    }
    
    public static int factorialRecursivo (int numero2) {

        int res2;

        if (numero2 == 1) {
            return 1;
        } else {
            res2 = numero2 * factorialRecursivo (numero2 -1);
        }

        return res2;
    }

}

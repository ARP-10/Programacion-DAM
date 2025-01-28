import java.util.Scanner;

public class Unidad3 {

    private static char[] z;

    public static void main(String[] args){
        //Estamos "llamando" al teclado. Es para que el usuario pueda escribir
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?");
        int edad = teclado.nextInt();
        System.out.println("Tu edad es: " + edad);

        System.out.println("¿Cuál es tu nombre?");
        //Esto lo ponemos para que el teclado nos deje escribir
        teclado.nextLine();

        String nombre = teclado.nextLine();
        System.out.println(nombre);

        //Importante "cerrar" el teclado
        teclado.close();
        
        if (edad>=18){
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }
        System.out.println("Fin");
        

        int i = 2;

        //Aquí usamos el salto "break"
        switch(i) {
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.println("i es menor que cinco");
            break;
          case 5:
            System.out.println("i es cinco");
            break;
          case 6:
          case 7:
          case 8:
          case 9:
            System.out.println("i es menor que diez y mayor a cinco");
            break;
          default:
            System.out.println("i es diez o mayor a diez");
        }

        //Creamos un "bucle"
        int a = 0; 
        while (a <= 10) 
        { 
            //Condicióna evaluar que determinará la conitnuidad o no del bucle
            System.out.println(a);
            a++;  
        }

        //Creamos un "bucle" diciendo que si o si primero imprima algo y después va la condición
        int b = 1;
        do{
            System.out.println(b);
            b++;
        } while (b <= 10);

        //Sabemos hasta donde llega el "bucle"
        for (int z = 1; z<= 10; z++);{
            System.out.println(z);
        }

        //Utilizar el salto "continue". En este caso no es posible
        for (int ia = 0; ia < 10; i++){
          System.out.println("Dentro del bucle por donde pasará diez veces");

          /*continue;
          System.out.println("Nunca escribirá esta instrucción, ya que no llegará nunca");*/
        }

    }
}

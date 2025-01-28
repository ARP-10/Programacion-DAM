package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>(); //Ponemos Estudiante porque mi arrayList de elementos de tipo Estudiante

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos estudiantes vas a introducir?");
        int num = teclado.nextInt();
        teclado.nextLine(); //Haciendo esto nos aseguramos de eliminar el buffer. Si no lo ponemos no nos dejara anadir el nombre del estudiante ya que ese .nextLine() cogera un espacio en blanco en vez de dejarnos insertar un nombre
        
        for (int i=0; i<num; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese e la nota 1 del estudiante " + (i + 1) + ": ");
            double nota1 = teclado.nextDouble();
            System.out.println("Ingrese e la nota 2 del estudiante " + (i + 1) + ": ");
            double nota2 = teclado.nextDouble();
            System.out.println("Ingrese e la nota 3 del estudiante " + (i + 1) + ": ");
            double nota3 = teclado.nextDouble();
            teclado.nextLine();
            
            Estudiante estudiante = new Estudiante(nombre, nota1, nota2, nota3);
            estudiantes.add(estudiante);
        }

        for (int i=0; i<estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).getNombre() + " : " + estudiantes.get(i).calcularMedia()); //Ponemos estudianteS porque llamamos al ArrayList
        }

        teclado.close();


    }
}

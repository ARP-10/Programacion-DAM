package AS25;

import java.util.Scanner;

public class DivisionEntreEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador, denominador, resultado;
        System.out.print("Introduce el numerador: ");
        numerador = sc.nextInt();
        System.out.print("Introduce el denominador: ");
        denominador = sc.nextInt();
        sc.close();
        try {
            resultado = dividir(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("División por cero no permitida");
        } else {
            return numerador / denominador;
        }
    }
}

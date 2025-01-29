package Ejercicio4;

public class Prueba {

    public static void main(String[] args) {
        
        Banco banco = new Banco(200);

        try {
            banco.retirar(100);
        banco.depositar(50);
        banco.retirar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Excepcion: " + e.getMessage());
        } catch (Exception e) { //Es la excepcion general, siempre esta bien anadirla
            System.out.println("Excepcion: " + e.getMessage());
        } finally {
            System.out.println("El saldo de la cuenta es: " + banco.getSaldo());
        }
    }
}

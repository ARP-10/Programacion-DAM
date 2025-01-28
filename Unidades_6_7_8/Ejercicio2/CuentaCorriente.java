package Unidades_6_7_8.Ejercicio2;
/**
 * Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos. 
 * Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva. 
 * La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente. 
 * En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra. 
 * Se permite el saldo negativo.
 * 
 * Ejemplo de main:
 * 
 * CuentaCorriente cuenta1 = new CuentaCorriente(); 
 * CuentaCorriente cuenta2 = new CuentaCorriente(1500); 
 * CuentaCorriente cuenta3 = new CuentaCorriente(6000); 
 * System.out.println("Nº de cuenta: " + cuenta1.getNumCuenta() + " Saldo: " + cuenta1.getSaldo()); 
 * System.out.println("Nº de cuenta: " + cuenta2.getNumCuenta() + " Saldo: " + cuenta2.getSaldo()); 
 * System.out.println("Nº de cuenta: " + cuenta3.getNumCuenta() + " Saldo: " + cuenta3.getSaldo()); 
 * cuenta1.ingreso(2000);
 * cuenta2.cargo(600);
 * cuenta3.ingreso(75);
 * cuenta1.cargo(55);
 * cuenta2.transferencia(cuenta3, 100);
 * System.out.println("Nº de cuenta: " + cuenta1.getNumCuenta() + " Saldo: " + cuenta1.getSaldo()); 
 * System.out.println("Nº de cuenta: " + cuenta2.getNumCuenta() + " Saldo: " + cuenta2.getSaldo()); 
 * System.out.println("Nº de cuenta: " + cuenta3.getNumCuenta() + " Saldo: " + cuenta3.getSaldo()); 
 */
public class CuentaCorriente{
    private String numero = "";
    private double saldo;

    // Constructores
    public CuentaCorriente() { 
        this.generaNumero();
    }
    public CuentaCorriente(double saldo) { 
        this.generaNumero();
        this.saldo = saldo;
    }

    // Getters
    public String getNumCuenta(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    // Métodos
    private void generaNumero() { 
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random() * 10); 
        }
    }
    void ingreso(int dinero) { 
        saldo += dinero;
    }
    void cargo(int dinero) { 
        saldo -= dinero;
    }
    void transferencia(CuentaCorriente cuentaDestino, int dinero) { 
        saldo -= dinero;
        cuentaDestino.saldo += dinero;
    }

    public static void main(String[] args){
        CuentaCorriente cuenta1 = new CuentaCorriente(); 
        CuentaCorriente cuenta2 = new CuentaCorriente(1500); 
        CuentaCorriente cuenta3 = new CuentaCorriente(6000); 
        System.out.println("Nº de cuenta: " + cuenta1.getNumCuenta() + " Saldo: " + cuenta1.getSaldo()); 
        System.out.println("Nº de cuenta: " + cuenta2.getNumCuenta() + " Saldo: " + cuenta2.getSaldo()); 
        System.out.println("Nº de cuenta: " + cuenta3.getNumCuenta() + " Saldo: " + cuenta3.getSaldo()); 
        cuenta1.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println("Nº de cuenta: " + cuenta1.getNumCuenta() + " Saldo: " + cuenta1.getSaldo()); 
        System.out.println("Nº de cuenta: " + cuenta2.getNumCuenta() + " Saldo: " + cuenta2.getSaldo()); 
        System.out.println("Nº de cuenta: " + cuenta3.getNumCuenta() + " Saldo: " + cuenta3.getSaldo()); 
    }

}

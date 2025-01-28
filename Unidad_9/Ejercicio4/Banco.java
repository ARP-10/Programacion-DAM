package Ejercicio4;

public class Banco {
    private double saldo;

    //Constructor
    public Banco (double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar (double cantidad) throws SaldoInsuficienteException{ //Si utilizamos un try y un catch, no hay que utilizar estre throws
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else {
            saldo -= cantidad;
        }

        /*Lo mismo con try y catch (quitando el throws SaldoInsuficienteException)
        try {
            if (cantidad > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente");
            } else {
                saldo -= cantidad;
            }
        } catch (SaldoInsuficienteException e) {
            Sysout ("Excepcion: " + e.getmessage());
        }
        */
    }
}

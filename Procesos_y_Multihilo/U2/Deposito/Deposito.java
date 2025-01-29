package Deposito;

public class Deposito extends Thread{
    private int deposito;

    public Deposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (deposito >= 0 && deposito < 100) { 
                    llenado10();
                } else if (deposito >= 100 && deposito < 900) {
                    llenado5();
                } else if (deposito >= 900 && deposito < 1000) {
                    vaciado5();
                } else if (deposito == 1000) {
                    vaciado10();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    private synchronized void llenado10() throws InterruptedException {
        System.out.println("El depósito se va llenando... (10L/s)");
        deposito += 10;
        Thread.sleep(1000);
        System.out.println("El depósito tiene una cantidad de " + deposito);
        System.out.println("\n");
        notifyAll();
    }

    private synchronized void llenado5() throws InterruptedException {
        System.out.println("El depósito se va llenando... (5L/s)");
        deposito += 5;
        Thread.sleep(1000);
        System.out.println("El depósito tiene una cantidad de " + deposito);
        System.out.println("\n");
        notifyAll();
    }

    private synchronized void vaciado10() throws InterruptedException {
        System.out.println("El depósito se va vaciando... (10L/s)");
        deposito -= 10;
        Thread.sleep(1000);
        System.out.println("El depósito tiene una cantidad de " + deposito);
        System.out.println("\n");
        
    }

    private synchronized void vaciado5() throws InterruptedException {
        System.out.println("El depósito se va vaciando... (5L/s)");
        deposito -= 5;
        Thread.sleep(1000);
        System.out.println("El depósito tiene una cantidad de " + deposito);
        System.out.println("\n");
        notifyAll();
    }

    public static void main(String[] args) {
        System.out.println("Llenando el depósito de agua...");
        Deposito depo = new Deposito(850);
        depo.start();
        try {
            depo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

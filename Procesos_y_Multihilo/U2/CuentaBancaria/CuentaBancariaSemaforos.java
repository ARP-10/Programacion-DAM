package CuentaBancaria;

import java.util.concurrent.Semaphore;

public class CuentaBancariaSemaforos extends Thread{
    private int idUsuario;
    private static int cantidadCuenta = 2000;
    private Semaphore ingresarSemaforo = new Semaphore(1);
    private Semaphore retirarSemaforo = new Semaphore(1);

    public CuentaBancariaSemaforos(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override 
    public void run() {
        for (int i=0; i<=2; i++) {
            try {
                int operacion = (int) (Math.random() * 2) + 1;
                switch (operacion) {
                    case 1:
                        ingresarSemaforo.acquire();
                        System.out.println("El usuario " + idUsuario + " va a ingresar dinero");
                        Thread.sleep(3000);
                        int cantidadIngresar = (int) (Math.random() * 500) + 1;
                        cantidadCuenta += cantidadIngresar;
                        System.out.println("El usuario " + idUsuario + " ha ingresado " + cantidadIngresar + " euros");
                        ingresarSemaforo.release();
                        break;
                    
                    case 2:
                        retirarSemaforo.acquire();
                        System.out.println("El usuario " + idUsuario + " va a retirar dinero");
                        Thread.sleep(3000);
                        int cantidadRetirar = (int) (Math.random() * 500) + 1;
                        cantidadCuenta -= cantidadRetirar;
                        System.out.println("El usuario " + idUsuario + " ha retirado " + cantidadRetirar + " euros");
                        retirarSemaforo.release();
                        break;
                
                    default:
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Dinero total disponible en la cuenta: " + cantidadCuenta);
        Thread[] usuarios = new Thread[3];
        for (int i=0; i<usuarios.length; i++) {
            usuarios[i] = new CuentaBancariaSemaforos(i + 1);
            usuarios[i].start();
        }

        for (Thread usuario : usuarios) {
            try {
                usuario.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Dinero total disponible en la cuenta: " + cantidadCuenta);
    }
    
}

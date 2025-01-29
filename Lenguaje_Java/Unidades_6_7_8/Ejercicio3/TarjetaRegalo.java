package Unidades_6_7_8.Ejercicio3;
public class TarjetaRegalo {

    double saldo;

    //Constructor
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
    }

    public TarjetaRegalo() {

    }

    //Métodos
    public int asignarNumero() {
        int aleatorio = (int) (10000 + (99999-10000+1)*Math.random());
        return aleatorio;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double comprobarSaldo() { 
        return saldo;
    }

    public void gasta(double gasto) {
        if (gasto > saldo) {
            System.out.println("ERROR! No tienes suficiente dinero para gastar " + saldo);
        } else {
            saldo -= gasto;
        }
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double nuevoSaldo = this.comprobarSaldo() + t.comprobarSaldo(); 
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        

        System.out.println("El número de esta tarjeta es: " + t1.asignarNumero());
        System.out.println("El número de esta tarjeta es: " + t2.asignarNumero());
        
        
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);

        System.out.println(t1.comprobarSaldo());
        System.out.println(t2.comprobarSaldo());

        TarjetaRegalo t3 = t1.fusionaCon(t2);

        System.out.println(t1.comprobarSaldo());
        System.out.println(t2.comprobarSaldo());
        System.out.println(t3.comprobarSaldo());
    
        
    }
}


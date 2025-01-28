public class TarjetaRegalo { 
    String numero;
    double saldo;
    public TarjetaRegalo(double saldo) { this.saldo = saldo;
        // Genera un número de tarjeta aleatorio de 5 cifras
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            this.numero += (int)(Math.random() * 10); }
    }
    public void setSaldo(double saldo) { 
        this.saldo = saldo;
    }
    public double comprobarSaldo() { 
        return saldo;
    }
    void gasta(double gasto) { 
        if (gasto > saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gasto);
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
package CuentaBancariaAlumnos;

public class Principal extends Thread{
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria ("111 222 333 444", 500);
        
        Usuario u1 = new Usuario("111111", "usuario1", c1);
        Usuario u2 = new Usuario("222222", "usuario2", c1);
        Usuario u3 = new Usuario("333333", "usuario3", c1);

        u1.ingresar(c1, 100.0);
        u2.ingresar(c1, 200.0);
        u3.ingresar(c1, 150.0);

        

    }
}

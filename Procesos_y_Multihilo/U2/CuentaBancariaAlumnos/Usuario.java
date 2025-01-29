package CuentaBancariaAlumnos;

public class Usuario {
    protected String dni, nombre;
    protected CuentaBancaria cuenta;

    public Usuario(String dni, String nombre, CuentaBancaria cuenta) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    /* Dónde va el método ingresar?
     * Es un metodo que afecta directamente a un atributo dentro de una cuenta en concreto, entonces:
     */

    /* En este método controlamos le objeto cuenta. Cuando los diferentes hilos (cuentas) quieran ingresar, 
     *está controlado y sólo uno va a poder acceder / hacer esa tarea 
     */ 
    protected synchronized void ingresar (CuentaBancaria c, double cantidad) {
        c.setSaldo(c.getSaldo()+cantidad);
    }

    protected void retirar (CuentaBancaria c, double cantidad) {
        // Habría que meter un if para controlar que la cuenta no quede en negativo etc.
        c.setSaldo(c.getSaldo()-cantidad);
    }

    

    
    
}

package Dependencia;

class Mensajes {
    
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String NARANJA = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public void Info (String mensaje) {
        System.out.println(VERDE + mensaje + RESET);
    }

    public void Alerta (String mensaje) {
        System.out.println(NARANJA + mensaje + RESET);
    }

    public void Error (String mensaje) {
        System.out.println(ROJO + mensaje + RESET);
    }

}

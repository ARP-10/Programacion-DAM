public class Cubo {
    // Atributos
    int capacidad; // capacidad máxima en litros 
    int contenido; // contenido actual en litros
    // Métodos
    // constructor
    Cubo (int c) { 
        this.capacidad = c;
    }
    // Métodos getter
    int getCapacidad() { 
        return this.capacidad;
    }
    int getContenido() { 
        return this.contenido;
    }
    // Método setter
    void setContenido(int litros) { 
        this.contenido = litros;
    }
    // otros métodos
    void vacia() { 
        this.contenido = 0;
    }
    /**
     * Llena el cubo al máximo de su capacidad.
     */
    void llena() {
        this.contenido = this.capacidad;
    }
    /**
     * Pinta el cubo en la pantalla.
     * Se muestran los bordes del cubo con el carácter # y el
     * agua que contiene con el carácter ~.
     */
    void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) { System.out.println("#~~~~#");
            } else {
                System.out.println("# #");
            } 
        }
        System.out.println("######");
    }
    /**
     * Vuelca el contenido de un cubo sobre otro.
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.
     */
    void vuelcaEn(Cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();
        if (libres > 0) {
            if (this.contenido <= libres) {
                destino.setContenido(destino.getContenido() + this.contenido); 
                this.vacia();
        } else {
            this.contenido -= libres; destino.llena();
        } 
        }
    }

    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(2); 
        Cubo cubo2 = new Cubo(7);
        System.out.println("cubo1: \n");
        cubo1.pinta();
        System.out.println("\ncubo2: \n");
        cubo2.pinta();
        System.out.println("\nLleno el cubo1: \n");
        cubo1.llena();
        cubo1.pinta();
        System.out.println("\nEl cubo2 sigue vacío: \n");
        cubo2.pinta();
        System.out.println("\nAhora vuelco lo que tiene el cubo1 en el cubo2.\n");
        cubo1.vuelcaEn(cubo2);
        System.out.println("cubo1: \n");
        cubo1.pinta();
        System.out.println("\ncubo2: \n");
        cubo2.pinta();
        System.out.println("\nAhora vuelco lo que tiene el cubo2 en el cubo1.\n");
        cubo2.vuelcaEn(cubo1);
        System.out.println("cubo1: \n");
        cubo1.pinta();
        System.out.println("\ncubo2: \n");
        cubo2.pinta();
    } 
}


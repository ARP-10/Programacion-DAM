import java.util.ArrayList; 

public class Carrito {
    ArrayList<Elemento> a = new ArrayList<>();
    public void agrega(Elemento e) { 
        a.add(e);
    }
    public int numeroDeElementos() { 
        return a.size();
    }
    public double importeTotal() { 
        double total = 0;
        for (int i = 0; i < a.size(); i++) {
          total += a.get(i).getPrecio() * a.get(i).getCantidad();
        }
        return total; 
    }
    @Override
    public String toString() {
        String pinta = "Contenido del carrito\n=====================\n"; 
        for (int i = 0; i < a.size(); i++){
            pinta += a.get(i) + "\n";
        }
        return pinta; 
    }
}
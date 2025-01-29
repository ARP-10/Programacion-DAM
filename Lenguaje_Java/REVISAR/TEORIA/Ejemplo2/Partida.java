package Ejemplo2;
public abstract class Partida {
    protected int idPartida;

    Partida(int idPartida) {
        this.idPartida = idPartida;
    }

    protected int getIdPartida(){
        return idPartida;
    }

    protected abstract boolean addPlayer(Jugador J);
}
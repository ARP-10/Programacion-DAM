import controller.DAOEquipo;
import controller.DAOLiga;
import controller.DAOPartido;
import database.HibernateUtil;
import model.Equipo;
import model.Liga;
import model.Partido;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Entrada {
    public static void main(String[] args) {
        // Insertamos Liga
        DAOLiga operacionesLiga = new DAOLiga();
        operacionesLiga.insertarLiga(new Liga("NFL", "01/09/2024", "01/02/2025"));

        // Insertamos Equipos
        DAOEquipo operacionesEquipo = new DAOEquipo();
        operacionesEquipo.insertarEquipo(new Equipo("New Orleans Saints", "Nueva Orleans", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Philadelphia Eagles", "Filadelfia", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Chicago Bears", "Chicago", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Minnesota Vikings", "Minneapolis", 1));
        operacionesEquipo.insertarEquipo(new Equipo("New York Giants", "Nueva York", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Tampa Bay Buccaneers", "Tampa", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Arizona Cardinals", "Glendale", 1));
        operacionesEquipo.insertarEquipo(new Equipo("Seattle Seahawks", "Seattle", 1));

        // Insertamos partidos
        DAOPartido operacionesPartido = new DAOPartido();
        operacionesPartido.insertarPartido(new Partido("15/10/2024", 24, 28, 3, 6, 1));
        operacionesPartido.insertarPartido(new Partido("02/11/2024", 31, 17, 2, 7, 1));
        operacionesPartido.insertarPartido(new Partido("18/11/2024", 27, 20, 8, 5, 1));
        operacionesPartido.insertarPartido(new Partido("03/12/2024", 35, 21, 1, 4, 1));
        operacionesPartido.insertarPartido(new Partido("22/12/2024", 30, 14, 6, 4, 1));
        operacionesPartido.insertarPartido(new Partido("12/01/2025", 28, 24, 4, 2, 1));

        // Mostramos Equipos
        operacionesEquipo.mostrarEquipos();

        // Mostramos Partidos
        operacionesPartido.mostratPartidos();

        // Eliminamos Equipos
        operacionesEquipo.borrarEquipo(3);
        operacionesEquipo.borrarEquipo(7);




    }
}

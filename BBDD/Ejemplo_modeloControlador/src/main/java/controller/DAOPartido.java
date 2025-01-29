package controller;

import database.HibernateUtil;
import model.Equipo;
import model.Partido;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class DAOPartido {
    private SessionFactory sessionFactory;

    public DAOPartido(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertarPartido(Partido partido) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(partido);
        session.getTransaction().commit();
        session.close();

    }

    public void mostratPartidos() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Query: SELECT * FROM partidos
        Query<Partido> query = session.createQuery("Select a FROM Partido a", Partido.class);
        List<Partido> listado = query.list();
        for (Partido partido : listado) {
            System.out.println("\n");
            System.out.println("Partido jugado en fecha: " + partido.getFecha_partido() + " equipo local: " + partido.getId_equipo_local_fk() + " goles equipo local: " + partido.getGoles_equipoLocal() + " equipo visitante: " + partido.getId_equipo_visitante_fk() + " goles equipo visitante: " + partido.getGoles_equipoVisitante());
        }

        session.getTransaction().commit();
        session.close();

    }
}

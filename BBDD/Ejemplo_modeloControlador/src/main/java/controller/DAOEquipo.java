package controller;

import database.HibernateUtil;
import model.Equipo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class DAOEquipo {
    private SessionFactory sessionFactory;
    public DAOEquipo(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertarEquipo(Equipo equipo) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(equipo);
        session.getTransaction().commit();
        session.close();

    }

    public void mostrarEquipos() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Query: SELECT * FROM equipos
        Query<Equipo> query = session.createQuery("Select a FROM Equipo a", Equipo.class);
        List<Equipo> listado = query.list();
        for (Equipo equipo : listado) {
            System.out.println("Equipo: " + equipo.getNombreEquipo() + " - Ciudad: " + equipo.getCiudad());
        }

        session.getTransaction().commit();
        session.close();
    }

    public void borrarEquipo(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from Equipo a WHERE a.id=" + id);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();

    }
}

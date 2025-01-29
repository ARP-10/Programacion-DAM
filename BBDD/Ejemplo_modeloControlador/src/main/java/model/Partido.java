package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

//POJO
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table (name = "partidos")
@Entity
public class Partido implements Serializable {
    @Id
    @Column (name = "id_partido")
    private int id;
    @Column
    private String fecha_partido;
    @Column (name = "goles_equipo_local")
    private int goles_equipoLocal;
    @Column (name = "goles_equipo_visitante")
    private int goles_equipoVisitante;
    @Column
    private int id_equipo_local_fk;
    @Column
    private int id_equipo_visitante_fk;
    @Column
    private int id_liga;

    public Partido(String fecha_partido, int goles_equipoLocal, int goles_equipoVisitante, int id_equipo_local_fk, int id_equipo_visitante_fk, int id_liga) {
        this.fecha_partido = fecha_partido;
        this.goles_equipoLocal = goles_equipoLocal;
        this.goles_equipoVisitante = goles_equipoVisitante;
        this.id_equipo_local_fk = id_equipo_local_fk;
        this.id_equipo_visitante_fk = id_equipo_visitante_fk;
        this.id_liga = id_liga;
    }

    public String getFecha_partido() {
        return fecha_partido;
    }

    public int getGoles_equipoLocal() {
        return goles_equipoLocal;
    }

    public int getGoles_equipoVisitante() {
        return goles_equipoVisitante;
    }

    public int getId_equipo_local_fk() {
        return id_equipo_local_fk;
    }

    public int getId_equipo_visitante_fk() {
        return id_equipo_visitante_fk;
    }
}

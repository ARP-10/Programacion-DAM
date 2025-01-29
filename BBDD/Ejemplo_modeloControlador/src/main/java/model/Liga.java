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

// POJO
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ligas")
public class Liga implements Serializable {
    @Id
    @Column (name = "id_liga")
    private int id;
    @Column (name = "nombre_liga")
    private String nombreLiga;
    @Column
    private String fecha_inicio;
    @Column
    private String fecha_fin;

    public Liga(String nombreLiga, String fecha_inicio, String fecha_fin) {
        this.nombreLiga = nombreLiga;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }




}

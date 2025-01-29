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

@Entity
@Table (name = "equipos")
public class Equipo implements Serializable {

    @Id
    @Column (name = "id_equipo")
    private int id;
    @Column (name = "nombre_equipo")
    private String nombreEquipo;
    @Column
    private String ciudad;
    @Column
    private int id_liga;


    public Equipo(String nombreEquipo, String ciudad,int id_liga) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.id_liga = id_liga;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }


}

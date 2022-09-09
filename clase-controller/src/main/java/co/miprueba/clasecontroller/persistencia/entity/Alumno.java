package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idAlumno;

    @OneToOne
    @JoinColumn(name="id_persona", referencedColumnName = "id")
    private Persona persona;

    @OneToMany(mappedBy = "alumno")
    private List<MateriaAlumno> materiaAlumnos;

}

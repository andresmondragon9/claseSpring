package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="materia_alumno")
public class MateriaAlumno {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idMateriaAlumno;

    @ManyToOne
    @JoinColumn(name = "id_alumno" , referencedColumnName = "id")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_materia" , referencedColumnName = "id")
    private Materia materia;
}

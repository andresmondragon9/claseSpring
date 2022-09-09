package co.miprueba.clasecontroller.persistencia.entity;

import co.miprueba.clasecontroller.dominio.dto.VistaJson;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idMateria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "horas")
    private Integer horas;

    @Column(name = "creditos")
    private Integer creditos;

    @Column(name = "faculta")
    private Integer faculta;

    @OneToMany(mappedBy = "profesor")
    private List<ProfesorMateria> profesorMaterias;

    @OneToMany(mappedBy = "materia")
    private List<MateriaAlumno> materiaAlumnos;

}

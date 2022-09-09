package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idProfesor;

    @Column(name = "faculta")
    private String faculta;

    @OneToOne
    @JoinColumn(name="id_persona", referencedColumnName = "id")
    private Persona persona;

    @OneToMany(mappedBy = "profesor")
    private List<ProfesorMateria> profesorMaterias;


}

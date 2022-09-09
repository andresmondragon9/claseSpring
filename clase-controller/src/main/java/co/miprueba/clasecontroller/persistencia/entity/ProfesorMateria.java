package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "profesor_materia")
public class ProfesorMateria {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idProfesorMateria;

    @ManyToOne
    @JoinColumn(name = "id_profesor" , referencedColumnName = "id" ,insertable = false , updatable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_materia" , referencedColumnName = "id" ,insertable = false , updatable = false)
    private Materia materia;
}

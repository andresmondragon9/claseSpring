package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clase")
public class Clase {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idClase;

    @Column(name = "horario")
    private Integer horario;

    @Column(name = "numero_salon")
    private Integer numeroSalon;

    @OneToOne
    @JoinColumn(name="id_profesor", referencedColumnName = "id")
    private Profesor profesor;

    @OneToOne
    @JoinColumn(name="id_materia", referencedColumnName = "id")
    private Materia materia;

}

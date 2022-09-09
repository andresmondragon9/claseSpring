package co.miprueba.clasecontroller.persistencia.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPersona;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "edad")
    private Integer edad;

}

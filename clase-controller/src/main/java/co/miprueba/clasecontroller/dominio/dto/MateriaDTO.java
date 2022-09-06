package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

@Data
public class MateriaDTO {

    private Integer idMateria;
    private String nombre;
    private Integer horas;
    private Integer creditos;
    private Integer faculta;
}

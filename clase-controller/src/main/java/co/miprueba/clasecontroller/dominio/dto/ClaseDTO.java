package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

import java.util.List;
@Data
public class ClaseDTO {

    private MateriaDTO materiaDTO;
    private List<AlumnoDTO> alumnoDTOS;
    private Integer horario;
    private Integer numeroSalon;
    private ProfesorDTO profesorDTO;


}

package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

import java.util.List;

@Data
public class AlumnoDTO extends PersonaDTO{

    private Integer idAlumno;
    private List<MateriaDTO> materiaDTOS;
}

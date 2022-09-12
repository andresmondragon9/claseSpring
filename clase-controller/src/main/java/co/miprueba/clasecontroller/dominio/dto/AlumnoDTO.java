package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

import java.util.List;

@Data
public class AlumnoDTO{

    private Integer idAlumno;
    private List<MateriaDTO> materiaDTOS;
    private PersonaDTO personaDTO;
}

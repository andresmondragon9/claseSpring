package co.miprueba.clasecontroller.dominio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.List;
@Data
public class ClaseDTO {

    @JsonView(VistaJson.clase.class)
    private MateriaDTO materiaDTO;
    @JsonView(VistaJson.clase.class)
    private List<AlumnoDTO> alumnoDTOS;
    @JsonView(VistaJson.clase.class)
    private Integer horario;
    private Integer numeroSalon;
    @JsonView(VistaJson.clase.class)
    private ProfesorDTO profesorDTO;


}

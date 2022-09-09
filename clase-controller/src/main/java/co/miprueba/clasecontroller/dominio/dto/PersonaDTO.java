package co.miprueba.clasecontroller.dominio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class PersonaDTO {

    private Integer idPersona;
    @JsonView(VistaJson.clase.class)
    private String nombres;
    private String apellidos;
    private Integer edad;

}

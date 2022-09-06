package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

@Data
public class ResponsePersonaDTO {
    private PersonaDTO personaDTO;
    private String mensaje;
}

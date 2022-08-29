package co.miprueba.clasecontroller.dominio.dto;

public class ResponsePersonaDTO {
    private PersonaDTO personaDTO;
    private String mensaje;

    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

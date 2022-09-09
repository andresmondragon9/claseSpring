package co.miprueba.clasecontroller.persistencia.dao;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.persistencia.entity.Persona;
import org.springframework.stereotype.Component;

@Component
public class PersonaDao {

    public PersonaDTO personaToPersonaDTO(Persona persona){
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setIdPersona(persona.getIdPersona());
        personaDTO.setEdad(persona.getEdad());
        personaDTO.setNombres(persona.getNombres());
        personaDTO.setApellidos(personaDTO.getApellidos());
        return personaDTO;
    }

    public Persona personaDtoTOPersona(PersonaDTO personaDTO){
        Persona persona = new Persona();
        persona.setIdPersona(personaDTO.getIdPersona());
        persona.setApellidos(personaDTO.getApellidos());
        persona.setNombres(personaDTO.getNombres());
        persona.setEdad(personaDTO.getEdad());
        return persona;
    }
}

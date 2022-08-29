package co.miprueba.clasecontroller.dominio.service;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.dominio.dto.ResponsePersonaDTO;

import java.util.List;

public interface PersonaService {

    List<PersonaDTO> gelAllPersonas();

    ResponsePersonaDTO getPersonaById(Integer id);

    ResponsePersonaDTO crearPersona(PersonaDTO personaDTORequest);

    void actualizarPersona(PersonaDTO personaDTORequest);

    void eliminarPersona(Integer id);
}

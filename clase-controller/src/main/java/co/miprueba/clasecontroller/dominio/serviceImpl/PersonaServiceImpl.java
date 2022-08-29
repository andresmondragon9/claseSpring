package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.dominio.dto.ResponsePersonaDTO;
import co.miprueba.clasecontroller.dominio.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    PersonaDTO personaDto = new PersonaDTO();
    PersonaDTO personaDtoDos = new PersonaDTO();
    ArrayList<PersonaDTO> lista = new ArrayList<PersonaDTO>();

    @PostConstruct
    public void iniciarLista(){
        personaDto.setId(1);
        personaDto.setNombres("pedro");
        personaDto.setApellidos("perez");
        personaDto.setEdad(35);

        personaDtoDos.setId(2);
        personaDtoDos.setNombres("juan");
        personaDtoDos.setApellidos("gutierrez");
        personaDtoDos.setEdad(35);

        lista.add(personaDto);
        lista.add(personaDtoDos);
    }
    @Override
    public List<PersonaDTO> gelAllPersonas() {
        return lista;
    }

    @Override
    public ResponsePersonaDTO getPersonaById(Integer id) {
        ResponsePersonaDTO responsePersonaDTO = new ResponsePersonaDTO();
        responsePersonaDTO.setMensaje("no se encontro persona");
        PersonaDTO personaDTOBuscada = buscarPersona(id);
        if(personaDTOBuscada != null){
            responsePersonaDTO.setPersonaDTO(personaDTOBuscada);
            responsePersonaDTO.setMensaje("persona encontrada");
        }
        return responsePersonaDTO;
    }

    @Override
    public ResponsePersonaDTO crearPersona(PersonaDTO personaDTORequest) {
        ResponsePersonaDTO responsePersonaDTO = new ResponsePersonaDTO();
        responsePersonaDTO.setMensaje("ya existe persona");
        PersonaDTO personaDTOBuscada = buscarPersona(personaDTORequest.getId());
        if(personaDTOBuscada == null){
            lista.add(personaDTORequest);
            responsePersonaDTO.setPersonaDTO(personaDTORequest);
            responsePersonaDTO.setMensaje("persona creada");
        }
        return responsePersonaDTO;
    }

    @Override
    public void actualizarPersona(PersonaDTO personaDTORequest) {
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == personaDTORequest.getId()){
                personaDTO.setEdad(personaDTORequest.getEdad());
                personaDTO.setApellidos(personaDTORequest.getApellidos());
                personaDTO.setNombres(personaDTORequest.getNombres());
                break;
            }
        }
    }

    @Override
    public void eliminarPersona(Integer id) {
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == id){
                lista.remove(personaDTO);
                break;
            }
        }
    }

    public PersonaDTO buscarPersona(Integer id){
        PersonaDTO personaDTOencontrada = null;
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == id){
                personaDTOencontrada = personaDTO;
            }
        }
        return personaDTOencontrada;
    }
}

package co.miprueba.clasecontroller.web;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/saludo")
public class ControllerUno {
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

    @GetMapping("/all")
    public  ArrayList<PersonaDTO> all(){
        return lista;
    }

    @GetMapping("/byId/{id}")
    public  PersonaDTO all(@PathVariable Integer id){
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == id){
                return personaDTO;
            }
        }
        return null;
    }

    @PostMapping("/crearPersona")
    public  void crearPersona(@RequestBody PersonaDTO personaDTORequest){
        lista.add(personaDTORequest);
    }

    @PutMapping("/actualizaPersona")
    public  void actualizarPersona(@RequestBody PersonaDTO personaDTORequest){
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == personaDTORequest.getId()){
                personaDTO.setEdad(personaDTORequest.getEdad());
                personaDTO.setApellidos(personaDTORequest.getApellidos());
                personaDTO.setNombres(personaDTORequest.getNombres());
                break;
            }
        }
    }

    @DeleteMapping("eliminarPersona/{id}")
    public  void eliminarPersona(@PathVariable Integer id){
        for(PersonaDTO personaDTO : lista){
            if(personaDTO.getId() == id){
                lista.remove(personaDTO);
                break;
            }
        }
    }





}

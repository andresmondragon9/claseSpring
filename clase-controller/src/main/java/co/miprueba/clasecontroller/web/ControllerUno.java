package co.miprueba.clasecontroller.web;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/saludo")
public class ControllerUno {

    @GetMapping("/hola")
    public  String saludar(){
        return "Hola mundo !!";
    }

    @GetMapping("/holaGet2")
    public  String saludar2(){
        return "Hola mundo !!";
    }

    @GetMapping("/getPersona")
    public PersonaDTO getPersona(){
        var personaDto = new PersonaDTO();
        personaDto.setNombres("pedro");
        personaDto.setApellidos("perez");
        personaDto.setEdad(35);
        return personaDto;
    }

    @GetMapping("/getPersonaArray")
    public List<PersonaDTO> getPersonaArray(){
        var personaDto = new PersonaDTO();
        personaDto.setNombres("pedro");
        personaDto.setApellidos("perez");
        personaDto.setEdad(35);

        var personaDtoDos = new PersonaDTO();
        personaDto.setNombres("juan");
        personaDto.setApellidos("gutierrez");
        personaDto.setEdad(35);

        var lista = new ArrayList<PersonaDTO>();
        lista.add(personaDto);
        lista.add(personaDtoDos);

        var lista2 = new ArrayList<PersonaDTO>();

        lista2 = (ArrayList<PersonaDTO>) lista.clone();

        return lista;
    }


}

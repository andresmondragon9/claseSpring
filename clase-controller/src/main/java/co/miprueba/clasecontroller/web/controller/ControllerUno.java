package co.miprueba.clasecontroller.web.controller;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.dominio.dto.ResponsePersonaDTO;
import co.miprueba.clasecontroller.dominio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/saludo")
public class ControllerUno {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<PersonaDTO>>  all(){
        return new ResponseEntity<>(personaService.gelAllPersonas(), HttpStatus.OK) ;
    }

    @GetMapping("/byId/{id}")
    public  ResponseEntity<ResponsePersonaDTO> all(@PathVariable Integer id){
        return new ResponseEntity<>(personaService.getPersonaById(id), HttpStatus.OK);
    }

    @PostMapping("/crearPersona")
    public  ResponseEntity<ResponsePersonaDTO> crearPersona(@RequestBody PersonaDTO personaDTORequest){
      return new ResponseEntity<>(personaService.crearPersona(personaDTORequest), HttpStatus.OK);
    }

    @PutMapping("/actualizaPersona")
    public  void actualizarPersona(@RequestBody PersonaDTO personaDTORequest){
        personaService.actualizarPersona(personaDTORequest);
    }

    @DeleteMapping("eliminarPersona/{id}")
    public  void eliminarPersona(@PathVariable Integer id){
        personaService.eliminarPersona(id);
    }





}

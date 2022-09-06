package co.miprueba.clasecontroller.web.controller;


import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.dominio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ControllerProfesor {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/materias/{id}")
    public ResponseEntity<List<MateriaDTO>> all(@PathVariable Integer id){
        return new ResponseEntity<>(profesorService.listarMateriasByProfesor(id), HttpStatus.OK) ;
    }
}

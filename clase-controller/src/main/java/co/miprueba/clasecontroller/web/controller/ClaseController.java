package co.miprueba.clasecontroller.web.controller;

import co.miprueba.clasecontroller.dominio.dto.ClaseDTO;
import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.VistaJson;
import co.miprueba.clasecontroller.dominio.service.ClaseService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clase")
public class ClaseController {

    @Autowired
    private ClaseService claseService;
    @JsonView(VistaJson.clase.class)
    @GetMapping("/all")
    public ResponseEntity<List<ClaseDTO>> all(){
        return new ResponseEntity<>(claseService.listarClases(), HttpStatus.OK);
    }


}

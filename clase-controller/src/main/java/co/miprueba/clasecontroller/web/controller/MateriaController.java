package co.miprueba.clasecontroller.web.controller;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;
import co.miprueba.clasecontroller.dominio.dto.AlumnoMateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping("/crear")
    public ResponseEntity<MateriaDTO> crearMateria(@RequestBody MateriaDTO materiaDTO){
        return new ResponseEntity<>(materiaService.crearMateria(materiaDTO), HttpStatus.OK);
    }

    @PostMapping("/crear/alumno")
    public void crearMateriaAlumno(@RequestBody AlumnoMateriaDTO alumnoMateriaDTO){
        materiaService.crearAlumnoMateria(alumnoMateriaDTO);
    }


}

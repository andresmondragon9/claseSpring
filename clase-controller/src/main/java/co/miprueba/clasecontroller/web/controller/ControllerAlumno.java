package co.miprueba.clasecontroller.web.controller;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;
import co.miprueba.clasecontroller.dominio.dto.ProfesorDTO;
import co.miprueba.clasecontroller.dominio.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class ControllerAlumno {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/crear")
    public ResponseEntity<AlumnoDTO> crearAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return new ResponseEntity<>(alumnoService.crearAlumno(alumnoDTO), HttpStatus.OK);
    }
}

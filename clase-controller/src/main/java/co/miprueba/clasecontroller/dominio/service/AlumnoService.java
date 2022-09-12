package co.miprueba.clasecontroller.dominio.service;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;

import java.util.List;

public interface AlumnoService {

    List<AlumnoDTO> listaAlumnos(Integer idMateria);

    AlumnoDTO crearAlumno(AlumnoDTO alumnoDTO);
}

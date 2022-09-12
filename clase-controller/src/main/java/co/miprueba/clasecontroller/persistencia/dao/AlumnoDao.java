package co.miprueba.clasecontroller.persistencia.dao;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;
import co.miprueba.clasecontroller.persistencia.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDao {
    @Autowired
    private PersonaDao personaDao;

    public Alumno alumnoDtoToAlumno(AlumnoDTO alumnoDTO){
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(alumnoDTO.getIdAlumno());
        alumno.setPersona(personaDao.personaDtoTOPersona(alumnoDTO.getPersonaDTO()));
       return  alumno;
    }

    public AlumnoDTO alumnoToAlumnoDto(Alumno alumno){
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setIdAlumno(alumno.getIdAlumno());
        alumnoDTO.setPersonaDTO(personaDao.personaToPersonaDTO(alumno.getPersona()));
        return alumnoDTO;
    }
}

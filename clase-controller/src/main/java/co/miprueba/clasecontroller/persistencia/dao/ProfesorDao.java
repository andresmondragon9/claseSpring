package co.miprueba.clasecontroller.persistencia.dao;

import co.miprueba.clasecontroller.dominio.dto.PersonaDTO;
import co.miprueba.clasecontroller.dominio.dto.ProfesorDTO;
import co.miprueba.clasecontroller.persistencia.entity.Persona;
import co.miprueba.clasecontroller.persistencia.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProfesorDao {

    @Autowired
    private PersonaDao personaDao;

    public ProfesorDTO profesorToProfesorDTO(Profesor profesor){
        ProfesorDTO profesorDTO = new ProfesorDTO();
        profesorDTO.setPersonaDTO(new PersonaDTO());
        profesorDTO.setFaculta(profesor.getFaculta());
        profesorDTO.getPersonaDTO().setApellidos(profesor.getPersona().getApellidos());
        profesorDTO.getPersonaDTO().setNombres(profesor.getPersona().getNombres());
        profesorDTO.getPersonaDTO().setEdad(profesor.getPersona().getEdad());
        profesorDTO.getPersonaDTO().setIdPersona(profesor.getPersona().getIdPersona());
        profesorDTO.setIdProfsor(profesor.getIdProfesor());
        return profesorDTO;
    }

    public Profesor profesorDtoToProfesor(ProfesorDTO profesorDTO){
        Profesor profesor = new Profesor();
        profesor.setIdProfesor(profesorDTO.getIdProfsor());
        profesor.setFaculta(profesorDTO.getFaculta());
        profesor.setPersona(personaDao.personaDtoTOPersona(profesorDTO.getPersonaDTO()));
        return profesor;
    }

    public List<Profesor> profesorDtoListToProfesorList(List<ProfesorDTO> profesorDTOList){
        List<Profesor> profesorList = new ArrayList<>();
        for(ProfesorDTO profesorDTO: profesorDTOList){
            profesorList.add(profesorDtoToProfesor(profesorDTO));
        }
        return profesorList;
    }

    public List<ProfesorDTO> profesorListToProfesorDtoList(List<Profesor> profesorList){
        List<ProfesorDTO> profesorDtoList = new ArrayList<>();
        for(Profesor profesor: profesorList){
            profesorDtoList.add(profesorToProfesorDTO(profesor));
        }
        return profesorDtoList;
    }
}

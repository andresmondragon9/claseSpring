package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;
import co.miprueba.clasecontroller.dominio.dto.ClaseDTO;
import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.service.AlumnoService;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import co.miprueba.clasecontroller.dominio.service.PersonaService;
import co.miprueba.clasecontroller.persistencia.dao.AlumnoDao;
import co.miprueba.clasecontroller.persistencia.entity.Alumno;
import co.miprueba.clasecontroller.persistencia.repository.AlumnoRepository;
import co.miprueba.clasecontroller.persistencia.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private MateriaService materiaService;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private AlumnoDao alumnoDao;

    @Override
    public List<AlumnoDTO> listaAlumnos(Integer idMateria) {
        List<AlumnoDTO> alumnoDTOSRes = new ArrayList<>();
        /*for(AlumnoDTO alumnoDTO : listaAlumnos){
            for(MateriaDTO materiaDTO : alumnoDTO.getMateriaDTOS()){
                if(materiaDTO.getIdMateria() == idMateria){
                    alumnoDTOSRes.add(alumnoDTO);
                }
            }
        }*/
        return alumnoDTOSRes;
    }

    @Override
    public AlumnoDTO crearAlumno(AlumnoDTO alumnoDTO) {
        alumnoDTO.getPersonaDTO().setIdPersona(null);
        alumnoDTO.setIdAlumno(null);
        Alumno alumno = alumnoDao.alumnoDtoToAlumno(alumnoDTO);
        personaRepository.save(alumno.getPersona());
        alumnoRepository.save(alumno);
        return alumnoDao.alumnoToAlumnoDto(alumno);
    }
}

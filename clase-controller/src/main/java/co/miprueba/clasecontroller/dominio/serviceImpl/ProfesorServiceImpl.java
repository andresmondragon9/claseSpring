package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.ProfesorDTO;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import co.miprueba.clasecontroller.dominio.service.ProfesorService;
import co.miprueba.clasecontroller.persistencia.dao.PersonaDao;
import co.miprueba.clasecontroller.persistencia.dao.ProfesorDao;
import co.miprueba.clasecontroller.persistencia.entity.Persona;
import co.miprueba.clasecontroller.persistencia.entity.Profesor;
import co.miprueba.clasecontroller.persistencia.repository.PersonaRepository;
import co.miprueba.clasecontroller.persistencia.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private ProfesorDao profesorDao;

    @Autowired
    private PersonaDao personaDao;

    @Autowired
    private MateriaService materiaService;
    @Override
    public List<MateriaDTO> listarMateriasByProfesor(Integer idProfesor) {
        List<MateriaDTO> materias = new ArrayList<>();
        /*for(ProfesorDTO profesorDTO: profesoresDTO){
            if(profesorDTO.getIdProfsor() == idProfesor){
                materias =  profesorDTO.getMateriaDTOS();
                break;
            }
        }*/
        return materias;
    }

    @Override
    public ProfesorDTO obtenerProfresor(Integer idProfesor) {
        ProfesorDTO profesorDTORes = new ProfesorDTO();
        /*for(ProfesorDTO profesorDTO: profesoresDTO){
            if(profesorDTO.getIdProfsor() == idProfesor){
                profesorDTORes =  profesorDTO;
                break;
            }
        }*/
        return profesorDTORes;
    }

    @Override
    public ProfesorDTO crearProfesor(ProfesorDTO profesorDTO) {
        Profesor profesor = profesorDao.profesorDtoToProfesor(profesorDTO);
        personaRepository.save(profesor.getPersona());
        profesorRepository.save(profesor);
        return profesorDao.profesorToProfesorDTO(profesor);
    }

    @Override
    public List<ProfesorDTO> listarProfesores() {
        return profesorDao.profesorListToProfesorDtoList(profesorRepository.findAll());
    }


}

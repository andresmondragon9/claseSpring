package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.AlumnoMateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import co.miprueba.clasecontroller.persistencia.dao.MateriaDao;
import co.miprueba.clasecontroller.persistencia.entity.Alumno;
import co.miprueba.clasecontroller.persistencia.entity.Materia;
import co.miprueba.clasecontroller.persistencia.entity.MateriaAlumno;
import co.miprueba.clasecontroller.persistencia.repository.AlumnoMateriaRepository;
import co.miprueba.clasecontroller.persistencia.repository.AlumnoRepository;
import co.miprueba.clasecontroller.persistencia.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private AlumnoMateriaRepository alumnoMateriaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaDao materiaDao;

    @Override
    public List<MateriaDTO> obtenerMaterias(Integer faculta) {
        List<MateriaDTO> materias = new ArrayList<>();
        /*for(MateriaDTO materiaDTO : materiasDTO){
            if(materiaDTO.getFaculta() == faculta){
                materias.add(materiaDTO);
            }
        }*/
        return materias;
    }

    @Override
    public MateriaDTO obtenerMateria(Integer idMateria) {
        MateriaDTO materiaDTORes = new MateriaDTO();
        /*for(MateriaDTO materiaDTO : materiasDTO){
            if(materiaDTO.getIdMateria() == idMateria){
                materiaDTORes = materiaDTO;
                break;
            }
        }*/
        return materiaDTORes;
    }

    @Override
    public MateriaDTO crearMateria(MateriaDTO materiaDTO) {
       return  materiaDao.materiaToMateriaDot(materiaRepository.save(materiaDao.materiaDtoToMateria(materiaDTO)));
    }

    @Override
    public void crearAlumnoMateria(AlumnoMateriaDTO alumnoMateriaDTO) {
        Optional<Alumno>  alumno = alumnoRepository.findById(alumnoMateriaDTO.getIdAlumuno());
        Optional<Materia> materia = materiaRepository.findById(alumnoMateriaDTO.getIdMateria());
        if(alumno.isPresent() && materia.isPresent()){
            MateriaAlumno materiaAlumno = new MateriaAlumno();
            materiaAlumno.setAlumno(alumno.get());
            materiaAlumno.setMateria(materia.get());
            alumnoMateriaRepository.save(materiaAlumno);
        }
    }
}

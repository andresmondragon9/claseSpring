package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.AlumnoDTO;
import co.miprueba.clasecontroller.dominio.dto.ClaseDTO;
import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.service.AlumnoService;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
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
    private List<AlumnoDTO> listaAlumnos = new ArrayList<>();

    @PostConstruct
    public void iniciarLista(){
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setIdAlumno(1);
        alumnoDTO.setNombres("arnulfo");
        alumnoDTO.setApellidos("rodriguez");

        alumnoDTO.setMateriaDTOS(Arrays.asList(materiaService.obtenerMateria(1)));

        AlumnoDTO alumnoDTODos = new AlumnoDTO();
        alumnoDTODos.setIdAlumno(2);
        alumnoDTODos.setNombres("laura");
        alumnoDTODos.setApellidos("reyez");
        alumnoDTODos.setMateriaDTOS(Arrays.asList(materiaService.obtenerMateria(2)));

        AlumnoDTO alumnoDTOTres = new AlumnoDTO();
        alumnoDTOTres.setIdAlumno(2);
        alumnoDTOTres.setNombres("juan");
        alumnoDTOTres.setApellidos("torrez");
        alumnoDTOTres.setMateriaDTOS(Arrays.asList(materiaService.obtenerMateria(2)));

        listaAlumnos.add(alumnoDTO);
        listaAlumnos.add(alumnoDTODos);
    }
    @Override
    public List<AlumnoDTO> listaAlumnos(Integer idMateria) {
        List<AlumnoDTO> alumnoDTOSRes = new ArrayList<>();
        for(AlumnoDTO alumnoDTO : listaAlumnos){
            for(MateriaDTO materiaDTO : alumnoDTO.getMateriaDTOS()){
                if(materiaDTO.getIdMateria() == idMateria){
                    alumnoDTOSRes.add(alumnoDTO);
                }
            }
        }
        return alumnoDTOSRes;
    }
}

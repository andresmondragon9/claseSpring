package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.ClaseDTO;
import co.miprueba.clasecontroller.dominio.service.AlumnoService;
import co.miprueba.clasecontroller.dominio.service.ClaseService;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import co.miprueba.clasecontroller.dominio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClaseServiceImpl implements ClaseService {


    @Autowired
    private ProfesorService profesorService;

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private MateriaService materiaService;

    private List<ClaseDTO> clasesDTO = new ArrayList<>();


   @PostConstruct
    public void iniciarLista(){
        ClaseDTO claseDTO = new ClaseDTO();
        claseDTO.setMateriaDTO(materiaService.obtenerMateria(1));
        claseDTO.setProfesorDTO(profesorService.obtenerProfresor(1));
        claseDTO.setHorario(12);
        claseDTO.setNumeroSalon(101);
        claseDTO.setAlumnoDTOS(alumnoService.listaAlumnos(1));

        ClaseDTO claseDTODos = new ClaseDTO();
        claseDTODos.setMateriaDTO(materiaService.obtenerMateria(2));
        claseDTODos.setProfesorDTO(profesorService.obtenerProfresor(1));
        claseDTODos.setHorario(8);
        claseDTODos.setNumeroSalon(903);
        claseDTODos.setAlumnoDTOS(alumnoService.listaAlumnos(2));

        clasesDTO.add(claseDTO);
        clasesDTO.add(claseDTODos);
    }

    @Override
    public List<ClaseDTO> listarClases() {
        return clasesDTO;
    }
}

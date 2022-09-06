package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.ProfesorDTO;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import co.miprueba.clasecontroller.dominio.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private MateriaService materiaService;

    private List<ProfesorDTO> profesoresDTO = new ArrayList<>();

    @PostConstruct
    public void iniciarLista(){
        ProfesorDTO profesorDTOUno = new ProfesorDTO();
        profesorDTOUno.setIdProfsor(1);
        profesorDTOUno.setFaculta("Ciensas Basicas");
        profesorDTOUno.setEdad(30);
        profesorDTOUno.setNombres("Juan");
        profesorDTOUno.setApellidos("Perez");
        profesorDTOUno.setMateriaDTOS(materiaService.obtenerMaterias(1));

        ProfesorDTO profesorDTODos = new ProfesorDTO();
        profesorDTODos.setIdProfsor(2);
        profesorDTODos.setFaculta("Ingeneria");
        profesorDTODos.setEdad(35);
        profesorDTODos.setNombres("Pedro");
        profesorDTODos.setApellidos("Martinez");
        profesorDTODos.setMateriaDTOS(materiaService.obtenerMaterias(2));

        profesoresDTO.add(profesorDTOUno);
        profesoresDTO.add(profesorDTODos);

    }

    @Override
    public List<MateriaDTO> listarMateriasByProfesor(Integer idProfesor) {
        List<MateriaDTO> materias = new ArrayList<>();
        for(ProfesorDTO profesorDTO: profesoresDTO){
            if(profesorDTO.getIdProfsor() == idProfesor){
                materias =  profesorDTO.getMateriaDTOS();
                break;
            }
        }
        return materias;
    }

    @Override
    public ProfesorDTO obtenerProfresor(Integer idProfesor) {
        ProfesorDTO profesorDTORes = new ProfesorDTO();
        for(ProfesorDTO profesorDTO: profesoresDTO){
            if(profesorDTO.getIdProfsor() == idProfesor){
                profesorDTORes =  profesorDTO;
                break;
            }
        }
        return profesorDTORes;
    }
}

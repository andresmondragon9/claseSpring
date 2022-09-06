package co.miprueba.clasecontroller.dominio.serviceImpl;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.service.MateriaService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {


    private List<MateriaDTO> materiasDTO = new ArrayList<>();

    @PostConstruct
    public void iniciarLista(){
        MateriaDTO materiaDTOCalculo = new MateriaDTO();
        materiaDTOCalculo.setIdMateria(1);
        materiaDTOCalculo.setNombre("Calculo");
        materiaDTOCalculo.setCreditos(4);
        materiaDTOCalculo.setHoras(40);
        materiaDTOCalculo.setFaculta(1);

        MateriaDTO materiaDTOFisica = new MateriaDTO();
        materiaDTOFisica.setIdMateria(2);
        materiaDTOFisica.setNombre("Fisica");
        materiaDTOFisica.setCreditos(3);
        materiaDTOFisica.setHoras(35);
        materiaDTOFisica.setFaculta(1);

        MateriaDTO materiaDTOProgramacion = new MateriaDTO();
        materiaDTOProgramacion.setIdMateria(3);
        materiaDTOProgramacion.setNombre("Programacion");
        materiaDTOProgramacion.setCreditos(3);
        materiaDTOProgramacion.setHoras(35);
        materiaDTOProgramacion.setFaculta(2);

        materiasDTO.add(materiaDTOCalculo);
        materiasDTO.add(materiaDTOFisica);
        materiasDTO.add(materiaDTOProgramacion);

    }

    @Override
    public List<MateriaDTO> obtenerMaterias(Integer faculta) {
        List<MateriaDTO> materias = new ArrayList<>();
        for(MateriaDTO materiaDTO : materiasDTO){
            if(materiaDTO.getFaculta() == faculta){
                materias.add(materiaDTO);
            }
        }
        return materias;
    }

    @Override
    public MateriaDTO obtenerMateria(Integer idMateria) {
        MateriaDTO materiaDTORes = new MateriaDTO();
        for(MateriaDTO materiaDTO : materiasDTO){
            if(materiaDTO.getIdMateria() == idMateria){
                materiaDTORes = materiaDTO;
                break;
            }
        }
        return materiaDTORes;
    }
}

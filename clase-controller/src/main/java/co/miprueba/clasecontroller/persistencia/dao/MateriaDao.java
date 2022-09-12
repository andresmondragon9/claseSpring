package co.miprueba.clasecontroller.persistencia.dao;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.persistencia.entity.Materia;
import org.springframework.stereotype.Component;

@Component
public class MateriaDao {

    public MateriaDTO materiaToMateriaDot(Materia materia){
        MateriaDTO materiaDTO = new MateriaDTO();
        materiaDTO.setIdMateria(materia.getIdMateria());
        materiaDTO.setHoras(materia.getHoras());
        materiaDTO.setNombre(materia.getNombre());
        materiaDTO.setCreditos(materia.getCreditos());
        materiaDTO.setFaculta(materia.getFaculta());
        return  materiaDTO;
    }

    public Materia materiaDtoToMateria(MateriaDTO materiaDTO){
        Materia materia = new Materia();
        materia.setCreditos(materiaDTO.getCreditos());
        materia.setIdMateria(materiaDTO.getIdMateria());
        materia.setNombre(materiaDTO.getNombre());
        materia.setFaculta(materiaDTO.getFaculta());
        materia.setHoras(materiaDTO.getHoras());
        return materia;
    }
}

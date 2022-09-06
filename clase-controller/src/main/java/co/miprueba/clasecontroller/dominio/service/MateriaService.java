package co.miprueba.clasecontroller.dominio.service;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;

import java.util.List;

public interface MateriaService {

    List<MateriaDTO> obtenerMaterias(Integer faculta);

    MateriaDTO obtenerMateria(Integer idMateria);

}
